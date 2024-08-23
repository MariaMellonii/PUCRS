
/**
 * Escreva uma descrição da classe complementar2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
import java.lang.Math;
public class complementar2
{
     public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     double banca_A, banca_B, juiz_1, juiz_2, juiz_3, juiz_4, juiz_5, juiz_6, x, y, resultado;
     System.out.println("\finforme a nota da banca A:");
     banca_A = teclado.nextDouble();
     System.out.println("informe a nota do juiz _1");
     juiz_1 = teclado.nextDouble();
     System.out.println("informe a nota do juiz _2");
     juiz_2 = teclado.nextDouble();
     System.out.println("informe a nota do juiz _3");
     juiz_3 = teclado.nextDouble();
     System.out.println("informe a nota do juiz _4");
     juiz_4 = teclado.nextDouble();
     System.out.println("informe a nota do juiz _5");
     juiz_5 = teclado.nextDouble();
     System.out.println("informe a nota do juiz _6");
     juiz_6 = teclado.nextDouble();
     x = Math.max(Math.max(Math.max(Math.max(Math.max(juiz_1, juiz_2), juiz_3), juiz_4),juiz_5), juiz_6);
     y = Math.min(Math.min(Math.min(Math.min(Math.min(juiz_1, juiz_2), juiz_3), juiz_4),juiz_5), juiz_6);
     banca_B = (juiz_1 + juiz_2 + juiz_3 + juiz_4 + juiz_5 + juiz_6 - x - y) / 4;
     System.out.println("a nota da banca B e:" + banca_B);
     resultado = banca_A + banca_B;
     System.out.println("a nota final da atleta e:" + resultado);
     
              } 
}
