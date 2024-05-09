import java.util.Scanner;

public class Numeros {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quantos números deseja inserir? ");
        int tamanho = scan.nextInt();

        int[] numeros = new int[tamanho];
        int quantidade = 0;
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o " + (i+1) + "º número inteiro: ");
            numeros[i] = scan.nextInt();
            if (numeros[i] >= 0) {
                soma += numeros[i];
                quantidade++;
            } else {
                break;
            }
        }

        if (quantidade == 0) {
            System.out.println("\nNenhum número válido foi inserido.");
        } else {
            int media = soma / quantidade;
            System.out.println("\nA quantidade de números digitados foi de " + quantidade + " e a média dos números é de " + media);
        }
    }
}