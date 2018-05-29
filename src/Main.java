import simpleAdder.interpret.Interpreter;
import simpleAdder.parser.* ; 
import simpleAdder.lexer.* ; 
import simpleAdder.node.* ; 
  
import java.io.* ;

public class Main {
	public static void main(String[] args) {
		args = new String[1];
		args[0]="teste1.sa";
	      if (args.length > 0) { 
	         try { 
	            /* Form our AST */ 
	            Lexer lexer = new Lexer (new PushbackReader(new FileReader(args[0]), 1024));
	            Token t;
	            
	            String nome;
	            t = lexer.next();
	            int linha;
	            linha = t.getLine();
	            while (! t.getClass().getSimpleName().equals("EOF")){
	            	
	            	nome= t.getClass().getSimpleName();
	            	t = lexer.next();
	            	if (nome.equals("TBlank"))
	            		nome=" ";
	            	if (t.getLine() == linha){
	            		System.out.print(nome+" ");
	            	}else {
	            		System.out.println(nome);
	            		linha = t.getLine();
	            	}
	            	
	            	
	            	
	            }
	            
	         } 
	         catch (Exception e) { 
	            System.out.println (e) ; 
	         } 
	      } else { 
	         System.err.println("usage: java simpleAdder inputFile"); 
	         System.exit(1); 
	      } 
	   } 
}