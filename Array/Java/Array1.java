import javax.print.DocFlavor.INPUT_STREAM;

class Array1{
    public static int largestElement(int [] arr){
        int large = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }

        return large;
    }
    
    public static int secondLargestElement(int [] arr){
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > large){
                slarge = large;
                large = arr[i];
            }else if (arr[i] > slarge){
                slarge = arr[i];
            }
        }

        return slarge;
    }

    public static boolean sortedArrayCheck(int [] arr){
        boolean x = true;

        for (int i = 0 ; i < arr.length -1 ; i++){
            if (arr[i] > arr[i+1]){
                x = false;
            }
        }

        return x;
    }

    public static int [] removeDublicatesFromSortedArray(int [] arr){
        int i = 1;
        int j = 0;

        for (;i<arr.length;i++){
            if (arr[i] == arr[j]){
                // j = i;
            }else{
                arr[j+1] = arr[i];
                j++;
            }
        }

        for (j=j+1;j<arr.length;j++){
            arr[j] = -1;
        }

        for (i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void main(String [] args){
        int [] arr = {5,3,1,2,4};
        int [] arr2 = {1,2,3,4,5};
        int [] arr3 = {1,1,2,2,3,4,5};

        // System.out.println(arr);
        System.out.println(largestElement(arr));
        System.out.println(secondLargestElement(arr));
        System.out.println(sortedArrayCheck(arr2));
        removeDublicatesFromSortedArray(arr3);
    }
}