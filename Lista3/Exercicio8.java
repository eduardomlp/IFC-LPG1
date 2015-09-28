package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio8 {
    public static void main(String[] args){
        int marcador, i=0;
        double feminino = 0, masculino = 0, idadeHomensExp = 0, contadorHomens = 0, homensVelhos = 0, mulheresNovasExp = 0, novinha = 10000;
        int[] idade, sexo, exp;
        String sexoI, expI;
        idade = new int[255];
        sexo = new int[255];
        exp = new int[255];
        Scanner ler = new Scanner(System.in);
        
        marcador = 0;
        
        while(true){
        
            if(marcador == 0){
                System.out.print("Digite a idade do candidato: ");
                idade[i] = ler.nextInt();            
            }else{
                System.out.print("Digite a idade do candidato ou 0 para encerrar o programa: ");
                idade[i] = ler.nextInt();     
                if(idade[i] == 0){
                    break;
                }
            }
            
            System.out.print("Digite o sexo do candidato: ");
            sexoI = ler.next();
            //System.out.println(sexoI);
            if((sexoI.equals("M"))||(sexoI.equals("m"))||(sexoI.equals("MASC"))||(sexoI.equals("masc"))){
                //masculino++;
                sexo[i] = 1;
            }else{
                //feminino++;
                sexo[i] = 2;
            }
            
            System.out.print("Tem experiência no serviço?");
            expI = ler.next();
            if((expI.equals("S"))||(expI.equals("s"))||(expI.equals("SIM"))||(expI.equals("sim"))){
                exp[i] = 1;
            }else{
                exp[i] = 2;
            }
            i++;
            marcador = 1;
        }
        
        for(int count = 0; count < i; count++){
            if(sexo[count] == 1){
                masculino++;
            }
            else{
                feminino++;                
            }
            
            if(exp[count] == 1 && sexo[count] == 1){
                idadeHomensExp += idade[count];
                contadorHomens++;
            }
            
            if(sexo[count] == 1 && idade[count] > 45){
                homensVelhos++;
            }
            
            if(sexo[count] == 2 && idade[count] < 35 && exp[count] == 1){
                mulheresNovasExp++;
            }
            
            if(sexo[count] == 2 && idade[count] < novinha && exp[count] == 1){
                novinha = idade[count];
            }
        }
        
        System.out.println("\nNúmero de candidatos femininos = " + feminino +
                           "\n Número de candidatos masculinos = " + masculino + 
                           "\n Idade média dos homens com experiência no serviço = " + idadeHomensExp/ contadorHomens +
                           "\n Porcentagem de homens com mais de 45 anos = " + (homensVelhos/masculino)*100 + "%" + 
                           "\n Número de mulheres experientes e com idade menor que 35 anos = " + mulheresNovasExp +
                           "\n Mulher experiente com menor idade = " + novinha);
    }
}
