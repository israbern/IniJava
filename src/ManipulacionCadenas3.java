

public class ManipulacionCadenas3 {

    public static void main(String[] args) {
    
        String alumno1, alumno2;

        alumno1 = "Isra";
        alumno2 = "isra";
        
        //Con .equals nos compara las variables que le asignemos sin ignorar las mayusculas
        System.out.println(alumno1.equals(alumno2));

        //Con .equalsIgnoreCase nos compara las variables ignorando las mayusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
    }
    
}
