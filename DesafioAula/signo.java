
/**
 * Escreva uma descrição da classe signo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;

public class signo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("insira o dia do seu aniversario (sem zero):");
        int dia = teclado.nextInt();
        System.out.print("insira o mes do seu aniversario (sem zero):");
        int mes = teclado.nextInt();

        String signo = obterSigno(dia,mes);
        
        if(signo != null){
            System.out.println("Seu signo e:" + signo);
        }else{
            System.out.println("Data invalida");
            }
          
}


public static String obterSigno (int dia, int mes) {
    if(mes == 1){
        return (dia <= 20) ? "capricornio" : "aquario";
    } else if(mes == 2){
        return (dia <= 18) ? "aquario" : "peixes";
    } else if(mes == 3){
        return (dia <= 20) ? "peixes" : "aries";
    } else if(mes == 4){
        return (dia <= 20) ? "aries" : "touro";
    } else if(mes == 5){
        return (dia <= 20) ? "touro" : "gemeos";
    } else if(mes == 6){
        return (dia <= 20) ? "gemeos" : "cancer";
    } else if(mes == 7){
        return (dia <= 22) ? "cancer" : "leao";
    } else if(mes == 8){
        return (dia <= 22) ? "leao" : "virgem";
    } else if(mes == 9){
        return (dia <= 22) ? "virgem" : "libra";
    } else if(mes == 10){
        return (dia <= 21) ? "libra" : "escorpiao";
    } else if(mes == 11){
        return (dia <= 21) ? "escorpiao" : "sagitario";
    } else if(mes == 12){
        return (dia <= 20) ? "sagitario" : "capricornio";
    } else {
        return null;
    }
}

}

