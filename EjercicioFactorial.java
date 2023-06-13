public class EjercicioFactorial {
    

    public static void main(String[] args) {
        
        int factorial =1;
        for( int num = 1; num <= 10; num++){
            factorial *= num;
                System.out.print( " factorial de " + num + " = " + factorial);
            
            System.out.println(" ");
        }
    }
}
