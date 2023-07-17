import java.util.Scanner;

public class MainDiagonalSum {
    static int findMainDiagonalSum(int[][] matrix){
        int sum =0;
        for(int i = 0; i < matrix.length; i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findMainDiagonalSum(matrix));
    }
}
