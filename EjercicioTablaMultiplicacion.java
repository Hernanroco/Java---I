public class EjercicioTablaMultiplicacion {

    public static void main(String[] args) {
        
        for(int count = 0; count <= 10; count++){
            for(int multiplicacion = 0; multiplicacion <= 10; multiplicacion++){
                System.out.print(  count * multiplicacion );
                System.out.print( " ");
            }
            System.out.println();
        }
    }
}