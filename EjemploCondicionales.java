public class EjemploCondicionales {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int edad = 16;
        int cantidad = 2;

        if (edad >= 18){
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido");
        }
        else {
            if ( cantidad >= 2){
                System.out.println("Por tener acompañante puede ingresar");
            } else
            System.out.println("No es permitido su ingreso");
        }
    }
}