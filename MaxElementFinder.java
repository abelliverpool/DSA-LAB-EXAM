// question 4
public class MaxElementFinder {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6,17 ,80};
        int result = findMax(inputArray);
        System.out.println("Maximum element in the array: " + result);
    }
}
