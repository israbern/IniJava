public class ManipulacionCadenas2 {

    public static void main(String[] args) {
        
        String frase = "Hoy es un estupendo día para aprender a programar en Java";

        //Con .substring() nos devuleve el valor que comprende en el numero de las letras que asignemos
        String frase_resumen = frase.substring(29, 57);

        System.out.println(frase_resumen);
    }
    
}
