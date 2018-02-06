import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * This one should be fun. Try to find the maximum path sum of the triangle in ../res/triangle.txt!
 * The problem is outlined at: https://projecteuler.net/problem=67.
 * Note that it will take very long to brute force it, so don't even try.
 * File I/O has already been handled for you.
 *
 * */
public class MaxPathSum {

    public static void main(String[] args) {

        try(BufferedReader reader = Files.newBufferedReader(Paths.get("res/triangle.txt"), Charset.forName("US-ASCII"))) {

            String line;
            while((line = reader.readLine()) != null) {

                // do something here
                // this will run once per line

            }

        } catch(IOException e) {}

    }

}
