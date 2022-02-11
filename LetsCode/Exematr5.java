import java.util.Scanner;

public class Exematr5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[2][2];
        int cont = 0;
        int dig ;
        int linha = 0;
        int coluna = 0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número para matriz ");
                m[i][j] = ler.nextInt();
            }
        }
        System.out.println("Digite um número para ver se possui na matriz ");
        dig = ler.nextInt();

        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {

                if (dig == m[ii][jj]){
                    linha = ii + 1;
                    coluna = jj + 1;
                    System.out.println("O número possui na matriz, está na linha " + linha + " E a coluna " + coluna );
                }


            }

        }


    }
}
