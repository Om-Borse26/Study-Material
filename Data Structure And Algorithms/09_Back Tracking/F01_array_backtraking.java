public class F01_array_backtraking {

    public static void main(String args[]){

        int arr[] = new int[5];

        changeArray(0,arr,1);
        System.out.println();

        printArr(arr);


    
    }

    public static void changeArray(int i,int arr[],int val){

        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArray(i+1,arr,val+1);
        arr[i] = arr[i]-2;     // backtracking step



    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
