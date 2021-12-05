package day02.demoExceptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[7]; // set up array w/ 7 indices
//            arr[4] = 30 / 0;
            arr[4] = 30 / 10;
            System.out.println(arr[4]);
            System.out.println(arr[14]); // `Error: Out of Bounds`
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds");
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide A Number By 0");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Chillin");

        // WHEN YOU HAVE TO USE TRY/CATCH
//        *** NETWORKING
        URL url = null;
        try {
            url = new URL("http://www.google.com");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } // catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
    }

}
