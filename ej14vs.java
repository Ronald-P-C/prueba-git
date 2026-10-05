import java.util.Scanner;
public class ej14vs {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in) ; 
        System.out.print("Ingrese un numero positivo : ");
        int numero = teclado.nextInt(); 
        if (numero > 0) { 
            if (numero % 2 != 0 ) { 
                numero -- ; 
            }
            for (int contador = numero; contador > 0 ; contador -= 2 ) {
            System.out.println(contador);
            }
        } else { 
            System.out.print("Ingrese un numero positivo");
        }
        teclado.close();
    }
}
                
                
     
