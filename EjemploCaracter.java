public class EjemploCaracter {
    public static void main(String[] args) {

//Tambien puede trabajar con la tabla ascii
        char caracter = 'a';
        System.out.println(caracter);

        caracter = 65;
        System.out.println(caracter);

//convierte una suma en un dato tipo character
        char segundoCaracter =  (char) (caracter + 1);
        System.out.println(segundoCaracter);

        String palabra = "Alura CURSO ONLINE";
        System.out.println(palabra);

        palabra = palabra + " 2022";
        System.out.println(palabra);

    }
}
