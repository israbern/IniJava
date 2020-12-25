
public class Variables {

	public static void main(String[] args) {
		
		
		
		byte edad=35; //Declaración e iniciación de una variable es una única línea
		
		
		/* La siguiente instrucción imprime en la consola (System.out) el valor de
		 * la variable edad
		 */
		edad=75;
		/* En consola no se refleja el valor 35 porque en java la lectura es descendente, así pues
		 * la ultima lectura antes de un .println es 75
		 */
		         
		
		
		
		System.out.println(edad);
		
		edad=60; // Para sacar varios valores hay que colocar otra linea con (System.out.println) que lo imprima en consola
		
		System.out.println(edad);
		
	

	}

}
