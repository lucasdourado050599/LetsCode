import java.util.Scanner;

public class Exematr11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[3][3];
        int mm [][] = new int[3][3];



        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número ");
                m[i][j] = ler.nextInt();


                if ( i == 0 &&  j== 0  ){
                    mm [0][0] = m[i][j];
                }
                else if ( i == 1 &&  j== 0){
                    mm [0][1] = m[i][j];
                }
                else if ( i == 2 &&  j== 0){
                    mm [0][2] = m[i][j];
                }
                else if ( i == 0 &&  j== 1){
                    mm [1][0] = m[i][j];
                }
                else if ( i == 1 &&  j== 1){
                    mm [1][1] = m[i][j];
                }
                else if ( i == 2 &&  j== 1){
                    mm [1][2] = m[i][j];
                }
                else if ( i == 0 &&  j== 2){
                    mm [2][0] = m[i][j];
                }
                else if ( i == 1 &&  j== 2){
                    mm [2][1] = m[i][j];
                }
                else if ( i == 2 &&  j== 2){
                    mm [2][2] = m[i][j];
                }





            }
        }


        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {
                System.out.print(mm[ii][jj] + " ");

            }
            System.out.println("");
        }

    }
}
