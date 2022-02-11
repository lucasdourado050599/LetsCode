import java.util.Scanner;

public class Exematr1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[3][3];
        int cont = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número ");
                m[i][j] = ler.nextInt();
                if (m[i][j]> 10){
                    cont ++;
                }
            }
        }
        System.out.println(" teste " + cont);
    }
}
