import java.util.Scanner;

public class MatrixMultiplication {
    // display matrix
    static void printmatrix(int M[][],int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    //multiplication
    static void matrixmulti(int a[][],int row1,int col1,int b[][],int row2,int col2){

        int[][] c=new int[row1][col2];
        System.out.println("\n- - - Matrix a - - -");
        printmatrix(a, row1, col1);
        System.out.println("\n- - - Matrix b - - -");
        printmatrix(b, row2, col2);
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                
            }
        }
        System.out.println("\n- - - PRODUCT - - -");
        printmatrix(c, row1, col2);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("\n= = = MATRIX MULTIPLICATION = = =");
        System.out.println("\nEnter the number of row and coloumn in Matrix a:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("\nEnter the number of row and coloumn in Matrix b:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        if(r1==c2&&r2==c1)
        {
            System.out.println("\n Enter the elements of matrix a:");
            for(int i=0;i<r1;i++)
                for(int j=0;j<c1;j++)
                    a[i][j]=sc.nextInt();
            
            System.out.println("\n Enter the elements of matrix b:");
            for(int i=0;i<r2;i++)
                for(int j=0;j<c2;j++)
                    b[i][j]=sc.nextInt();
            
            matrixmulti(a,r1,c1,b,r2,c2);


        }else{
            System.out.println("\nMatrix Multiplication not possible");
        }

        sc.close();
    }
    
}
