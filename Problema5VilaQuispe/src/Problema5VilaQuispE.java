import java.util.Scanner;
public class Problema5VilaQuispE {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	        System.out.println("ingrese la frase: ");
	       String cadena = entrada.nextLine();
	       cadena = cadena.replace(" ", "");
	       int lenght = cadena.length();
	       char [] cadenaChar = cadena.toCharArray();
	       int n = lenght;
	       if ( lenght % 2 != 0){
	           lenght = lenght + 1;
	        }
	      
	       boolean palindromo = true;
	       
	       for (int i = 0; i < lenght/2 ; i++) {
	                      
	           char a = cadenaChar[i];
	           char b = cadenaChar[n - 1 -i];
	           
	            if(a == b){
	               
	           }
	           else{
	               palindromo = false;
	               
	               break;
	            }
	       }
	       
	       if (palindromo == true){
	           System.out.println(" es palindromo");
	       }
	       else{
	           System.out.println(" no es palindromo");
	       }
	} 
}

