
/**
 * Escreva uma descrição da classe exercicio1 aqui.
 * 
 * @author (Maria Melloni) 
 * @version (16/08)
 */
import java.util.Scanner ;
public class exercicio1
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in) ;
        
        int valor1, valor2, resultado;
        
        System.out.println("\fInforme o valor1") ;
        System.out.println("Informe o valor1") ;
        valor1 = teclado.nextInt();
        System.out.println("Informe o valor2") ;
        valor2 = teclado.nextInt();
        
        resultado = valor1 + valor2;
        System.out.println("O resultado da soma e:" + resultado) ;
        }
}
