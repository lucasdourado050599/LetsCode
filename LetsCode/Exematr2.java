import java.util.Scanner;

public class Exematr2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m[][] = new int[3][3];
        int cont = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (j==0 && i == 0){
                     m [j][i] = 1;
                }
                else if (j==1 && i ==1) {
                    m[j][i] = 1;
                }
                else if (j==2 && i ==2) {
                    m[j][i] = 1;
                }
                else {
                    m[j][i] = 0;
                }
            }
        }
        for (int ii = 0; ii < m.length; ii++) {
            for (int jj = 0; jj < m.length; jj++) {

                System.out.print(m[ii][jj]);

            }
            System.out.println("");
        }


    }
}

/*
100
010
001
          I I I
        J 0 1 2
        J 0 1 2
        J 0 1 2

 */