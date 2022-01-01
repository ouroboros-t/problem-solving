import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //community solution:
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); //number of items ordered
        int k = scanner.nextInt(); //which item wasn't eaten
        int total = 0; //actual bill
        
        for (int i = 0; i < n; i++) { //loop through the number of items ordered
            int price = scanner.nextInt(); //get the price 
            if (i != k) total += price; //if items were eaten, add price to total
        }
        
        int charged = scanner.nextInt(); //next parameter is the amount Anna was charged for her half. 
        
        System.out.println(total / 2 == charged ? "Bon Appetit" : charged - (total/2)); //if bill actual equals bill charged, then read 'bon apetit' otherwise print the amount Anna is owed. 
    }
}