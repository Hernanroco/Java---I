public class Tienda {
    
    public static void main(String[] args) {
        
        double valorCompra = 100.0;

        if ( valorCompra < 199.99) {
            System.out.println("Su descuento sera del 10%");
        }else if(valorCompra > 200.0 && valorCompra < 299.99){
                System.out.println("Su descuento sera del 15%");
            }
            else {
                System.out.println("Su descuento sera del 30%");
            }
        }
    }