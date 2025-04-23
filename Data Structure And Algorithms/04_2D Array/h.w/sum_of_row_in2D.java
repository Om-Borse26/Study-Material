public class sum_of_row_in2D {

    public static void sum(int matrix[][]) {

        
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                    
                        sum += matrix[i][j];
                    
                }
                System.out.println("Sum of " + i  + "th row is : " + sum);
        }
        

        // System.out.println("Sum of middle row is " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        sum(matrix);

    }

}
