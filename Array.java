

public class Array {

    public static int ret_largest(int arr[]){
        int largest = arr[0];
        int sec_largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                sec_largest = largest;
                largest = Math.max(largest, arr[i]);
            }
            if(largest>arr[i] && sec_largest<arr[i]){
                sec_largest = arr[i];
            }
        }
        return sec_largest;
    }

    public static boolean isSorted(int arr[]){
        for (int i = 0; i < arr.length-1;i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void remove_duplicates(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                count++;
                arr[count] = arr[i+1];
            }
        }

        for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int arr[], int k){
        int n = arr.length;
        k = k % n; 
        
        int temp[] = new int[n];
        
        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[k + i];
        }
        
        for (int i = 0; i < k; i++) {
            temp[n - k + i] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        
        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void move_zeros(int arr[]){
        int p1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[p1];
                arr[p1] = arr[i];
                arr[i] = temp;
                p1++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void find_union(int arr1[],int arr2[]){
        int union[] = new int[arr1.length + arr2.length];
        int index = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            boolean present = false;
            for (int j = 0; j < index; j++) {
                if(arr1[i] == union[j]){
                    present = true;
                    break;
                }
            }
            if(!present){
                union[index] = arr1[i];
                index++;
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            boolean present = false;
            for (int j = 0; j < index; j++) {
                if(arr2[i] == union[j]){
                    present = true;
                    break;
                }
            }
            if(!present){
                union[index] = arr2[i];
                index++;
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + " ");
        }
    }

    public static void find_intersection(int arr1[], int arr2[]){
        int intersection[] = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    boolean present = false;
                    for (int k = 0; k < index; k++) {
                        if(intersection[k] == arr1[i]){
                            present = true;
                            break;
                        }
                    }

                    if(!present){
                        intersection[index] = arr1[i];
                        index++;
                    }
                    break; 
                }
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(intersection[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // System.out.println(ret_largest(arr));
        // if(isSorted(arr)){
        //     System.out.println("Array is Sorted");
        // }else{
        //     System.out.println("Array is Not Sorted");
        // }

        // int arr[] = {1,2,3,3,4,4,4,5,5,6};
        // remove_duplicates(arr);

        // int arr[] = {0,1,0,3,12,0,5,1,2,3,0,0,8,9};
        // rotateArray(arr, 2);
        // move_zeros(arr);

        int arr1[] = {1,2,2,3,4};
        int arr2[] = {2,3,4,4,5,6};
        
        // find_union(arr1, arr2);
        find_intersection(arr1, arr2);


    }
}
