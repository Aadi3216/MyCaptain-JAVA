import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want for matrix : ");
        int x = sc.nextInt();

        System.out.println("How many coloumn do you want for matrix : ");
        int y = sc.nextInt();

        int [][] mat1 = new int[x][y];
        int [][] mat2 = new int[x][y];

        int [][] result = new int[x][y];

        // Taking userinput for mat 1
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println("Enter the element for mat 1  " + i + " row and " + j + " Coloumn");
                mat1[i][j] = sc.nextInt();
            }
        }
        // printing mat1
        System.out.println("Matrix 1 is : ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }

        //Taking input for mat2
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.println("Enter the element for mat 2  " + i + " row and " + j + " Coloumn");
                mat2[i][j] = sc.nextInt();
            }
        }
        // printing mat1
        System.out.println("Matrix 2 is : ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");

            }
            System.out.println("");

        }

        //Addition of both the matrix
        System.out.println("Addition of matrix 1 and matrix 2 is: ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mat1[i][j] +mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
        

    

