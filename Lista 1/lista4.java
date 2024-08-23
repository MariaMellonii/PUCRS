
/**
 * Escreva uma descrição da classe lista4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class lista4 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        double fahrenheit, celsius;
        System.out.println("\fInforme o valor de fahrenheit");
        fahrenheit = teclado.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("O valor correspondente pra celsius e:" + celsius);
        }
}
