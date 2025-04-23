
public class Practice_Sorting {

    //bubble sort
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //selection sort
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort
    public static void insertionsort(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }
    }

    //counting sort
    //range
    public static void countingsort(int arr[]){
        int range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }

        int count[] = new int[range + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int pointer = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[pointer] = i;
                count[i]--;
                pointer++;
            }
        }
    }

    //print Arrays
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int array[] = {1,4,1,3,2,4,3,7};

        printArray(array);
        //bubblesort
        // bubblesort(array);
        // printArray(array);
        
        //selectionsort
        // selectionSort(array);
        // printArray(array);

        //insertionsort
        // insertionsort(array);
        // printArray(array);

        //countingsort
        countingsort(array);
        printArray(array);

        //inbuilt sort
    }
}
