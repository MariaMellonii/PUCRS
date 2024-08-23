
/**
 * Escreva uma descrição da classe complementar3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner ;
import java.lang.Math ; 
public class complementar3 
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        double litros, cm, distancia, kmpt , gas ;
        System.out.println("informe a capacidade do tanque:");
        litros = teclado.nextDouble();
        System.out.println("informe o consumo medio de gasolina do automóvel :");
        cm = teclado.nextDouble();
        System.out.println("informa a distancia que ser percorrida:");
        distancia = teclado.nextDouble();
        kmpt = litros * cm;
        gas = Math.ceil(distancia / kmpt);
        System.out.println("será necessario encher o tanque " + gas + " vezes.");
        }
}
