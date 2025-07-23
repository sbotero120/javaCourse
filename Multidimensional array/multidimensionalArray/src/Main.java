import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{0, 2}, {5, 4}};
        System.out.println("Your multidimensional array is: " + Arrays.deepToString(array));
        System.out.println("\nThis is another way to create a multidimensional array with a length:");

        int[][] arrayTwo = new int[3][6];
        arrayTwo[1][5] = 7;
        arrayTwo[1][1] = 8;
        arrayTwo[1][4] = 99;
        arrayTwo[1][3] = 10;
        arrayTwo[1][2] = 9;
        arrayTwo[1][0] = 5;
        arrayTwo[0][4] = 6;
        arrayTwo[0][2] = 9;
        arrayTwo[0][1] = 7;
        arrayTwo[0][3] = 10;
        System.out.println("This is your array created in the other way: \n" + Arrays.deepToString(arrayTwo));
    }
}
