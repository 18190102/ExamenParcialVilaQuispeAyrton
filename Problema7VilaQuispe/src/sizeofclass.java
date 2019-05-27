import java.util.*;
public class sizeofclass {
	
	    public static int sizeof (byte b){
	        return 1;
	    } 
	    public static int sizeof (short s){
	        return 2;
	    }
	    public static int sizeof ( int a){
	        return 4;
	    }
	    public static int sizeof (double b){
	        return 8;
	    }
	    public static int sizeof (float c) {
	        return 4;
	    }


public static void calcular (){
    Scanner entrada = new Scanner(System.in);
    int i=0; int x = 4; int w = 9 ;
    for (int j = 0; j < 20; j++) {
        x++;
        for (int q = 4; q < 10; q++) {
            do{
                i= +3;
                w = sizeof(i);
                
                i= x + w;
                x= w + i;
            }
            while(x<15);
        }
    }
    System.out.println("x: "+ x + " i: " + i);
}
}
