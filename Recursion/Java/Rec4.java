public class Rec4 {

    public static void reverseArray(int l , int r , int[] arr){
        if (l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(l+1, r-1, arr);
    }

    public static void reverseArraySingleVariable(int n , int [] arr){
        if (n >= arr.length -1 - n){
            return;
        }

        int temp = arr[n];
        arr[n] = arr[arr.length -1 -n];
        arr[arr.length -1 -n] = temp;

        reverseArraySingleVariable(n+1, arr);
    }

    public static boolean checkPallindrome(int l , int r , String s){
        if (l>=r){
            return true;
        }
        
        return (s.charAt(l) == s.charAt(r) && checkPallindrome(l+1, r-1, s));
    }
    
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
    
        for (int it : arr){
            System.out.print(it + " ");
        }
        System.out.println();

        // reverseArray(0, arr.length - 1, arr);
        reverseArraySingleVariable(0, arr);

        for (int it : arr){
            System.out.print(it + " ");
        }
        System.out.println();

        String s = "kanak";
        System.out.println(checkPallindrome(0, s.length() -1 , s));

    }
}
