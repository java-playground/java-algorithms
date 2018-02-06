import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * This one should be fun. Try to find the maximum path sum of the triangle in ../res/triangle.txt!
 * The problem is outlined at: https://projecteuler.net/problem=67.
 * Note that it will take very long to brute force it, so don't even try.
 * File I/O has already been handled for you.
 *
 * */
public class MaxPathSum {

    static List<List<String>> triangle = new ArrayList<>();

    public static void main(String[] args) {

        // file i/o
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("res/triangle.txt"), Charset.forName("US-ASCII"))) {

            String line;
            while((line = reader.readLine()) != null) {

                // too lazy to convert to ints, deal with strings later
                triangle.add(Arrays.asList(line.split(" ")));

            }

        } catch(IOException e) {}

        // squash down triangle from bottom up
        while(triangle.size() > 1) {

            // get second to last row, last row
            List<String> workingRow = triangle.get(triangle.size() - 2);
            List<String> lastRow = triangle.get(triangle.size() - 1);

            for(int i = 0; i < workingRow.size(); i++) {
                int currentRowCell = Integer.parseInt(workingRow.get(i));
                int lastRowCell1 = Integer.parseInt(lastRow.get(i));
                int lastRowCell2 = Integer.parseInt(lastRow.get(i+1));

                workingRow.set(i, (currentRowCell + Math.max(lastRowCell1, lastRowCell2)) + "");
            }

            // remove last row; not needed anymore
            triangle.remove(triangle.get(triangle.size() - 1));
        }

        // output should be in spot (0, 0) now
        System.out.println(triangle.get(0).get(0));

    }

}
