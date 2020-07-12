package min_max;

import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long totalResult = 0;
        for (int number : arr) {
            totalResult += number;
        }

        long min = totalResult;
        long max = 0;
        for (int number : arr) {
            long current = totalResult - number;
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
