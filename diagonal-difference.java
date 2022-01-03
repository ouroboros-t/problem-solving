import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftSum = 0;
    int rightSum = 0;
    int n = arr.size();
    for(int i = 0; i<arr.size(); i++){ 
        for(int j = 0; j<arr.size(); j++){
            if(i == j){ //when i is at position 1, then so is j (it's on a 3x3 matrix square).
                leftSum+= arr.get(i).get(j);//gets the numbers from left to right.
            }
            if(i == n -j-1){ //it's a square, so n = 3, and to go from right to left, we have to do n - j, well j starts at position (3) which is index 2, so we do j - 1, so we'll end up with n - j - 1. 
                rightSum += arr.get(i).get(j); //gets the numbers from right to left. 
            }
        }
    }
        return Math.abs(leftSum - rightSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
