
/**
 * Escreva uma descrição da classe lista1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner ;
import java.lang.Math ; 
public class lista1 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        double valor1, valor2, valor3, resultado;
        System.out.println("\fInforme o valor1");
        valor1 = teclado.nextDouble();
        System.out.println("Informe o valor2");
        valor2 = teclado.nextDouble();
        System.out.println("Informe o valor3");
        valor3 = teclado.nextDouble();    
        resultado = (valor1 + valor2 + valor3) / 3;
        System.out.println("O resultado da media aritmetica e:" + resultado);
        }
}

