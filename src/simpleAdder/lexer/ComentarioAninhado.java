package simpleAdder.lexer;

import simpleAdder.node.*;

public class ComentarioAninhado extends Lexer{
	private int count;
	private TComentario comentario;
	private StringBuffer text;
	//Definimos o construtor
		public ComentarioAninhado(java.io.PushbackReader in)
		{ 
			super(in);
		}

		// Definimos um filtro que reconhece comentarios aninhados
		@Override
		protected void filter() throws LexerException
		{ 
			//Coloque o código aqui...
			if(state.equals(State.COMENTARIO))
			{ // if we are just entering this state
				if(comentario == null)
					{ // The token is supposed to be a comment.
						// We keep a reference to it and set the count to one
						comentario = (TComentario) token;
						text = new StringBuffer(comentario.getText());
						count = 1;
						token = null; // continue to scan the input.
						
					}
				else
					{ // we were already in the comment state
						text.append(token.getText()); // accumulate the text.
						if(token instanceof TComentario)
							count++;
						else if(token instanceof TCommentEnd)
							count--;
						if(count != 0)
							token = null; // continue to scan the input.
						else
						{ 	comentario.setText(text.toString());
							token = comentario; //return a comment with the full text.
							state = State.NORMAL; //go back to normal.
							comentario = null; // We release this reference.
							
						}
					}
			}
		}
}
