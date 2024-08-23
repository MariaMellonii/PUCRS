
/**
 * Escreva uma descrição da classe complementar4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
import java.lang.Math;
public class complementar4{
     public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
     double bolinhas, qdb;
     final double caixas = 100;
     System.out.println("informe a quantidade de bolinhas de gude");
     bolinhas = teclado.nextDouble();
     qdb = Math.ceil(bolinhas / caixas);
     System.out.println("será necessario " + qdb + " de caixas");
          } 
}
