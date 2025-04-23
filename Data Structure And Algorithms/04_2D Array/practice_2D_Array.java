public class practice_2D_Array {

    public static int staircase_Search_upperRight(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(key == matrix[row][col]){
                System.out.println("Key found !!");
            }
            if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("KEy not found :(");
        return 0;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 27, 29, 37, 48 },
            { 32, 33, 39, 50 }
    };

        int key = 41;
        staircase_Search_upperRight(matrix, key);
    }
}
