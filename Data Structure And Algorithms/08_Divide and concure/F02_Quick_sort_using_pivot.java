public class F02_Quick_sort_using_pivot {

    public static void main(String args[]){

        int arr[] ={6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);

        //printing arr
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void quicksort(int arr[],int si, int ei){

        //base case
        if(si >= ei){
            return;
        }

        //here maiking new function to get array according to pivot
        int piIndex = partition(arr,si,ei);
        //for sorting the left part
        quicksort(arr,si,piIndex-1);

        //for sorting the rigth part
        quicksort(arr,piIndex+1,ei);


    }

    public static int partition(int arr[],int si, int ei){

        //this is piviot around which we will sort the elements
        int piviot = arr[ei];
        
        //int i for difining the positions of the swapped elements
        //taking si-1 because it will not have any position before finding a element below piviot element

        int i = si-1;
        
        for(int j = si; j< ei; j++){
            if(arr[j]<piviot){
                
                i++;
                //swap

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //for putting the piviot in right place

        i++;
        int temp = piviot;
        arr[ei] = arr[i];              // dont do pivot  = arr[i] bcoz it becomes call be value and does not make changes outside the class whereas we need to return the value so we need to pass call by reference 
        arr[i] = temp;
        //here i is the position of piviot
        return i;
    }
    
}
