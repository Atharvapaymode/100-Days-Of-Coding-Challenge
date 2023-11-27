import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             for (int j = 0; j < n; j++){ // we have created the series given in the question, j denotes the power of 2
                a += b * (int) Math.pow(2, j); 
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
