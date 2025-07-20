import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];

        System.out.println("Your array without changes is: \n" + Arrays.toString(array));

        array[0] = 3;
        array[1] = 8;
        array[4] = 7;
        array[2] = 6;
        array[5] = 5;
        array[6] = 9;

        System.out.println("Your modified array looks like this: \n" + Arrays.toString(array));

        // Properties
        // 1. This will say the length
        System.out.println("Your array has the following number of elements: \n" + array.length);
        // 2. This sorts the array
        Arrays.sort(array);

        System.out.println("Your sorted array would look like this: \n" + Arrays.toString(array));

        // Another way
        System.out.println("\nThis is the other array:");
        int[] secondArray = {9, 9, 0, 9, 2};
        System.out.println("\nYour second array looks like this: \n" + Arrays.toString(secondArray));
        System.out.println("Your second array has the following number of elements: \n" + secondArray.length);
    }
}
