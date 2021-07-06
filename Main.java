package PPP;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 5, 8}, {7, 8, 9, 6}, {4, 3, 78, 91}, {182, 648, 318, 99852}};
        System.out.println(getMax(array));

    }
    public static double getMax(int[][] array){
        double y = 0;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    y = Math.sqrt(Math.abs(Math.sin(-1.49) - (4 * Math.log(23.4)) / Math.pow(i, j)));
                }
            }
        }
        return y;
    }
}

