
/**
 * Escreva uma descrição da classe complementar1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
import java.lang.Math;
public class complementar1
{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int hora, minuto, segundos, time, day_over;
    System.out.print ("\finforme a hora desejada:");
    hora = teclado.nextInt();
    System.out.print ("informe o minuto desejado:");
    minuto = teclado.nextInt();
    System.out.print ("informe os segundos desejados:");
    segundos = teclado.nextInt();
    time = (hora * 3600) + (minuto * 60) + segundos;
    System.out.println("horario convertido em segundos: " + time);
    day_over = 86400 - time;
    System.out.println("restam "+ day_over + " para o dia acabar.");
          } 
} 
