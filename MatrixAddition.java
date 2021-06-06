import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class MatrixAddition {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("== Matrix Addition ==");
        System.out.println();
        //matrix a declaration and initialization
        System.out.println("== Matrix A ==");
        System.out.print("Enter the number of Row and Column : ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.print("Enter the elements of matrix a  :");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a[i][j]=sc.nextInt();
        
        //matrix b declaration and initialization
        System.out.println("\n== Matrix B ==");
        System.out.print("Enter the number of Row and Column : ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("Enter the elements of matrix b  :");
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                b[i][j]=sc.nextInt();

        System.out.println("\n---- Matrix a ----");
        for (int[] is : a) {
            for (int i : is) {
                System.out.print(i+"   ");
            }
            System.out.println();
        }
        System.out.println("\n---- Matrix b ----");
        for (int[] is : b) {
            for (int i : is) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        if(r1==r2&&c1==c2){   
            int[][] sum=new int[r1][c1];
            for (int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("== Sum of Matrix ==");
            for (int[] is : sum) {
                for (int i : is) {
                    System.out.print(i+"  ");
                }
                System.out.println();
            }
        }else{
            System.out.println("This matrix addition doesn't support");
        }

    
    


    }
    
}
