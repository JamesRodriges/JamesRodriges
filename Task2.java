package PPP;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[9];
        System.out.println(Arrays.toString(sortMass(array)));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortMass(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
