import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v[][] = new int[100][100];
        int n, i,j , f=1, f1=0, f2=1;

        System.out.println("Generate a matrix:");
        System.out.print("Enter the dimension (nxn) n = ");
        n= scan.nextInt();
        System.out.println();

        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                //setting the value 0 on the secondary diagonal
                if (i+j == n+1)
                    v[i][j] = 0;
                //setting the value n-index+1 above the secondary diagonal
                else if (i+j<n-1) {
                    v[i][j] = n-i+1;
                } 
                //setting the fibonacci values below the secondary diagonal
                else if (i+j>n-1) {
                    v[i][j]=f;
                    f=f1+f2;
                    f1=f2;
                    f2=f;
                }
            }
        }

        //display the matrix
        System.out.println("Your matrix is: ");
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                System.out.print("\t"+v[i][j] + "\t");
            }
            System.out.println();
        }
    }
}