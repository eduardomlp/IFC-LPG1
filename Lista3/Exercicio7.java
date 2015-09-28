package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 * 
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio7 {
    public static void main(String[] args){
        double horas, valorHoraExtra, valorHoraNormal, salarioB, quantHoras, salarioF;
        int i;
        
        Scanner ler = new Scanner(System.in);
        
        salarioF = 0;
        i=1;
       
        
        while(i == 1){
            System.out.print("Digite o salário bruto do funcionário: ");
            salarioB = ler.nextDouble();
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horas = ler.nextDouble();

            if (horas > 160) {
                if (salarioB < 800) {
                    quantHoras = horas - 160;
                    valorHoraNormal = salarioB / 160;
                    valorHoraExtra = quantHoras * ((valorHoraNormal) / 2);
                    salarioF = salarioB + valorHoraExtra;
                }
                if ((salarioB >= 800) || (salarioB <= 1600)) {
                    salarioB -= (salarioB * 13) / 100;
                    quantHoras = horas - 160;
                    valorHoraNormal = salarioB / 160;
                    valorHoraExtra = quantHoras * ((valorHoraNormal) / 2);
                    salarioF = salarioB + valorHoraExtra;
                }
                if (salarioB > 1600) {
                    salarioB -= (salarioB * 22) / 100;
                    quantHoras = horas - 160;
                    valorHoraNormal = salarioB / 160;
                    valorHoraExtra = quantHoras * ((valorHoraNormal) / 2);
                    salarioF = salarioB + valorHoraExtra;
                }
            } else {
                if (salarioB < 800) {
                    salarioF = salarioB;
                }
                if ((salarioB >= 800) || (salarioB <= 1600)) {
                    salarioB -= (salarioB * 13) / 100;
                    salarioF = salarioB;
                }
                if (salarioB > 1600) {
                    salarioB -= (salarioB * 22) / 100;
                    salarioF = salarioB;
                }
            }
       
        System.out.println("Salário do funcionário = " + salarioF);

        System.out.println("Digite 1 para calcular o salário líquido de outro funcionário ou 0 para encerrar o programa");
        i = ler.nextInt();
        }
    }    
}
