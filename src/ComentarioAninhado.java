import simpleAdder.lexer.Lexer;	
import simpleAdder.lexer.LexerException;
import simpleAdder.node.TComentario;
import simpleAdder.node.TCommentEnd;

public class ComentarioAninhado extends Lexer{ 
	private int count;
	private TComentario comment;
	private StringBuffer text;
	  
	// Definimos o construtor
	public ComentarioAninhado(java.io.PushbackReader in){ 
		super(in);
	}

	// Definimos um filtro que reconhece comentarios aninhados
	@Override
	protected void filter() throws LexerException{ 
		/* Entrando em estado de comentario */
		if(state.equals(State.COMENTARIO)) {
			// se estamos apenas entrando nesse estado
			if(comment == null) {
				// O token é supostamente um comentário.
				// Nós mantemos uma referência a ela e definimos a contagem para um
				comment = (TComentario) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null;
			}
			else {
				/* ja estavamos num estado de comentario */
				text.append(token.getText());
				
				if(token instanceof TComentario)
					count++;
				else if (token instanceof TCommentEnd)
					count--;
					
					if(count != 0) { // continua verificando entrada
						token = null;
					}
					else {
						comment.setText(text.toString());
						token = comment; 		// retorna um comentario com o texto completo
						state = State.NORMAL; 	// volta ao normal
						comment = null; 		// a referencia é liberada
					}
			}
		}
		
	}
}