package time_conversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] splits = s.split(":");
        Integer hour = Integer.parseInt(splits[0]);
        if (splits[2].endsWith("PM")) {
            if (hour != 12) {
                hour = hour + 12;
            } else {
                hour = 12;
            }
            splits[0] = String.valueOf(hour);
         } else {
            if (hour == 12) {
                splits[0] = "00";
            }
        }

            splits[2] = splits[2].substring(0, 2);
         return String.join(":", splits);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}
