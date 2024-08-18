
/**
 * Escreva uma descrição da classe lista5 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class lista5 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        int valor1, valor2, resultado;
        System.out.println("\fInforme o valor1");
        valor1 = teclado.nextInt();
        System.out.println("Informe o valor2");
        valor2 = teclado.nextInt(); 
        resultado = valor1 + valor2;
        System.out.println("O resultado da soma e:" + resultado);
        resultado = valor1 - valor2;
        System.out.println("O resultado da diferenca e:" + resultado);
        resultado = (valor1 + valor2) / 2;
        System.out.println("O resultado da media e:" + resultado);
        resultado = Math.abs(valor1 - valor2);
        System.out.println("O resultado da distancia e:" + resultado);
        resultado = valor1 + valor2 + (Math.abs(valor1 - valor2));
        System.out.println("O resultado do maior dos dois e:" + resultado);
        resultado = valor1 + valor2 - (Math.abs(valor1 - valor2));
        System.out.println("O resultado do menor dos dois e:" + resultado);
                }
}

