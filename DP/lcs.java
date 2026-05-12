import javax.management.RuntimeMBeanException;

class lcs{
    public static void main(String [] args){
        String s1 = "akshat";
        StringBuilder s2 = new StringBuilder("akshat");

        s2.reverse();
        System.out.println(s1);
        System.out.println(s2);

        int n1 = s1.length();
        int n2 = s2.length();

        int [][] arr = new int[n1+1][n2+1];

        for (int i = 0 ; i<=n1 ; i++ ){
            for (int j = 0 ; j<=n2 ; j++ ){
                if (i == 0 || j == 0){
                    arr[i][j] = 0;
                }else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }else{
                    arr[i][j] = Math.max(arr[i-1][j] , arr[i][j-1]);
                }
            }
        }
        String s = "\n";
        for (int i = 0 ; i<n1+1 ; i++ ){
            for (int j = 0 ; j<n2+1 ; j++ ){
                System.out.print(arr[i][j]);
                s = s + arr[i][j];
            }
            System.out.println();
            s = s + "\n";
        }

        System.out.println(arr[n1][n2]);

        throw new RuntimeException(s);


    }
}