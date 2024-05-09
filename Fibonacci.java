public class Fibonacci {
    static int limite[] = new int[30];
    public static void main(String[] args) {
        int atual = 1;
        int ant = 0;
        int calc;
        for(int i = 0; i<limite.length; i++){
            limite[i] = atual;
            calc = ant + atual;
            ant = atual;
            atual = calc;

        }
        for(int i = 0; i<limite.length; i++){
            System.out.print(limite[i] + " ");
        }
    }
}