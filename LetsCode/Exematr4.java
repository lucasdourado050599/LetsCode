import java.util.Scanner;

public class Exematr4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[2][2];
        int n = 0;

        int linha = 0;
        int coluna = 0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número ");
                m[i][j] = ler.nextInt();

                if (m[i][j] > n ){

                    n = m[i][j];
                    linha = i + 1;
                    coluna = j + 1;

                }


            }
        }
        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {
                System.out.print(m[ii][jj] + " ");
            }
            System.out.println("");
        }
        System.out.println("O maior número está na linha " + linha + " E coluna " + coluna);
    }
}
