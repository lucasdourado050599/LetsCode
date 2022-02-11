import java.util.Scanner;

public class Exematr9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[3][3];
        int cont = 0;
        int contt = 0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um número ");
                m[i][j] = ler.nextInt();


                if ( i == 1 &&  j== 0  ){
                    cont = m[i][j];
                    contt = contt + cont;
                }
                else if ( i == 2 &&  j== 0){
                    cont = m[i][j];
                    contt = contt + cont;
                }
                else if ( i == 2 &&  j== 1){
                    cont = m[i][j];
                    contt = contt + cont;
                }
                }
            }


        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {
                System.out.print(m[ii][jj] + " ");

            }
            System.out.println("");
        }
        System.out.println(contt);
    }
}

/*
100
010
001


 */