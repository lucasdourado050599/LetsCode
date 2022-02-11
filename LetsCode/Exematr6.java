import java.util.Scanner;

public class Exematr6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[2][2];
        int mm[][] = new int[2][2];
        int ve[][] = new int[2][2];


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número para matriz A");
                m[i][j] = ler.nextInt();
            }
        }

        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {
                System.out.println("Digite um número para matriz B ");
                mm[ii][jj] = ler.nextInt();
            }
        }

        for (int iii = 0; iii < m.length; iii++) {
            for (int jjj = 0; jjj < m.length; jjj++) {

               if ( m[iii][jjj] >= mm[iii][jjj]){
                    ve[iii][jjj] = m[iii][jjj];
                }
               else {
                   ve[iii][jjj] = mm[iii][jjj];
               }


            }
        }

        for (int iiii = 0; iiii < m.length; iiii++) {
            for (int jjjj = 0; jjjj < m.length; jjjj++) {
                System.out.println("A matriz com os maiores valores das 2 matrizes ficou " + ve[iiii][jjjj]);
                System.out.println(ve[iiii][jjjj]);
            }
        }


    }
}
