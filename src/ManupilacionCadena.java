public class ManupilacionCadena {

    public static void main(String[] args) {


        String nombre = "Israel";

        System.out.println("Mi nombre es " + nombre);

        //COn .length nos devuleve el numero de letras de la variable asignada
        System.out.println("mi nombre tiene " + nombre.length() + " letras. ");

        //Con .chartAt nos devuleve la letra que le asignemos a la variable
        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultimaLetra;

        ultimaLetra = nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultimaLetra-1));



















    }
    
}
