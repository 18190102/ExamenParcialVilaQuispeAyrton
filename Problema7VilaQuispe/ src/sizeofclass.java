paquete  ejercicio7 ;

 clase  pública ProblemaFinal {
	public  static  void  main ( String [] args ) {
		int i, x = 4 , w = 9 , q;
		
		para (i = - 1 ; i < 20 ; i + = 3 ) {
			x ++ ;
			para (q = 4 ; q < 11 ; q ++ ) {
				hacer {
					i = + 3 ;
					w = 4 ;
					i = x + w;
					x = w + i;
					
				} mientras (x < 15 );
			}
		}
		Sistema . a cabo . println ( " x: " + x + "  " + " i: " + i);
	}


}
