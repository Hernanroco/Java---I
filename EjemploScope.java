public class EjemploScope {
    
    public static void main(String[] args) {
        
        int edad = 18;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1; // de este modo sabemos si es true o false
        boolean puedeIngresar = edad >= 18 && esPareja;

        System.out.println("El valor de la condicion es : " + esPareja);

        if (puedeIngresar){
            System.out.println("Usted puede entrar");
        }
        else {
            System.out.println("No es permitido su ingreso");
        }
    }
}
