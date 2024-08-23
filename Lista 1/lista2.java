
/**
 * Escreva uma descrição da classe lista2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class lista2 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        final double G = 6.67426;
        final double M = 5.97;
        final double R = 6371;
        double T;
        double resultado;
        System.out.println("\fInforme o valor T");
        T = teclado.nextDouble();
        resultado = ((G * M * Math.pow(T,2))/4 * (Math.pow(Math.PI,2)) - R);
        System.out.println("O resultado de H:" + resultado);
        }
}
