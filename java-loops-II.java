import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
            for(int j = 0; j < t; j++){
                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();
                int c = a;
                for(int i = 0; i < n; i++){
                    c+= Math.pow(2,i) * b;
                    System.out.print(c + " ");
           }
            System.out.println();
        }
        scan.close();
        
        
        
        
        
    }
}
