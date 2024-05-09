import java.util.Scanner;

public class Notas {
    static double nAlunos[] =  new double [10];
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        //Inserindo notas
        for(int i=0; i<nAlunos.length; i++){
            System.out.print("\nInforme a nota do aluno " + (i+1) + ":");
            double nota = scan.nextDouble();
            nAlunos[i] = nota;
        }

        //Imprimindo notas
        for(int i=0; i<nAlunos.length;i++){
            System.out.println("Nota aluno " + (i+1) + ": " + nAlunos[i]);
        }

        //Calculando media
        double calc = 0;
        for(int i=0; i<nAlunos.length-1; i++){
            calc += nAlunos[i];
        }
        double media = calc / nAlunos.length;
        System.out.print("\nA media é " + media + "\n");

        //notas acima ou abaixo da media
        int acima = 0;
        int abaixo = 0;
        for(int i=0; i<nAlunos.length; i++){
            if(nAlunos[i] >= media){
                acima++;
            }
            else{abaixo++;}
        }
        System.out.println(acima + " alunos acima ou igual a media e " + abaixo + " abaixo da media das notas calculadas.");
    }
}
