
/**
 * Escreva uma descrição da classe lista6 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class lista6 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner (System.in);
        int valor1;
        System.out.println("\fInforme o valor1");
        valor1 = teclado.nextInt();
        int quant_cem = valor1 / 100;
        valor1 = valor1 % 100;
        int quant_cin = valor1 / 50;
        valor1 = valor1 % 50;
        int quant_vin = valor1 / 20;
        valor1 = valor1 % 20;
        int quant_dez = valor1 / 10;
        valor1 = valor1 % 10;
        int quant_fiv = valor1 / 5;
        valor1 = valor1 % 5;
        int quant_two = valor1 / 2;
        valor1 = valor1 % 2;
        int quant_one = valor1 / 1;
        valor1 = valor1 % 1;
        System.out.println("A quantidade de notas de 100:" + quant_cem);
        System.out.println("A quantidade de notas de 50:" + quant_cin);
        System.out.println("A quantidade de notas de 20:" + quant_vin);
        System.out.println("A quantidade de notas de 10:" + quant_dez);
        System.out.println("A quantidade de notas de 5:" + quant_fiv);
        System.out.println("A quantidade de notas de 2:" + quant_two);
        System.out.println("A quantidade de notas de 1:" + quant_one);
                                        }
}

