public class practice_divide_Conquor {

    public static int rotatedArray(int arr[], int key, int si, int ei){

        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == key){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= key && key<= arr[mid]){
                return rotatedArray(arr, key, si, mid-1);
            }
            else{
                return rotatedArray(arr, key, mid+1, ei);
            }
        } else {
            if(arr[mid] <= key && key <= arr[ei]){
                return rotatedArray(arr, key, mid+1, ei);
            }
            else{
                return rotatedArray(arr, key, si, mid-1);
            }
        }

    }



    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(rotatedArray(arr, 2, 0, arr.length-1));
        
    }
}
