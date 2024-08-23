
/**
 * Escreva uma descrição da classe lista3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class lista3 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        double n, resultado;
        System.out.println("\fInforme o n");
        n = teclado.nextDouble();
        resultado = Math.pow(n,2);
        System.out.println("O resultado e:" + resultado);
        resultado = Math.pow(n,3);
        System.out.println("O resultado e:" + resultado);
        resultado = Math.pow(n,4);
        System.out.println("O resultado e:" + resultado);
        }
}
