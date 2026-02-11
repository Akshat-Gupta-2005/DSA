
public class Array2 {
    public static void reverseArray1(int [] arr2 , int i , int j){
        int [] arr = arr2.clone() ;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0 ; k < arr.length ; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void reverseArray2(int [] arr2 , int i , int j){
        int [] arr = arr2 ;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // for (int k = 0 ; k < arr.length ; k++){
        //     System.out.print(arr[k] + " ");
        // }
        // System.out.println();
    }

    public static void rotateByKPlaces(int [] arr2 , int k){
        k=k-1;
        int [] arr = arr2;
        reverseArray2(arr, 0, k);
        reverseArray2(arr, k+1, arr.length-1);
        reverseArray2(arr, 0, arr.length-1);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void zeroesToEnd(int []arr){
        int i = 0;
        int j = -1;
        
        for (;i<arr.length;i++){
            if (arr[i] == 0){
                
            }else{
                arr[j+1] = arr[i];
                j++;
            }
        }

        for (j=j+1;j<arr.length;j++){
            arr[j] = 0;
        }
        
        for (int n = 0 ; n<arr.length ; n++){
            System.out.print(arr[n] + " ");
        }
        
        System.out.println();
    }

    public static int linearSearch(int [] arr , int k){
        int index = -1;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == k){
                index = i;
            }
        }

        return index;
    }

    public static void main(String [] args){
        int [] arr = {5,3,1,2,4};
        int [] arr2 = {0,1,0,4,2,0};
        int [] arr3 = {5,3,1,2,4};

        reverseArray1(arr,0,arr.length-1);
        rotateByKPlaces(arr, 2);
        zeroesToEnd(arr2);
        System.out.println(linearSearch(arr3, 3));


    }
}
