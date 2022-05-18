package loops;
public class Matrix {
    public static void main(String[] args) {
        int[][] a={{1,0,0,},{0,1,0,},{0,0,1,}};
        int[][] b={{5,0,0,},{0,5,0,},{0,0,5,}};
        int[][] c={{5,0,0,0,},{0,5,0,0 },{0,0,5,0},{0,0,0,5}};
        char[][] ch={{'k','l','m','n'},{'n','k','l','m'},{'m','n','k','l'},{'l','m','n','k'}};
        int[][] e=new int[4][4];
     for (int i=0; i<4; i++) {
         for (int j = 0; j < 4; j++) {
             System.out.print("  " + ch[i][j] + "+" + c[i][j]);
         }
         System.out.println();

         for (int k = 0; k < 3; k++) {
             for (int l = 0; l < 3; l++) {
                 e[k][l] = a[k][l] + b[k][l];
                 System.out.print(a[k][l] + b[k][l]);
             }
             System.out.println();
         }
     }

    }
}
