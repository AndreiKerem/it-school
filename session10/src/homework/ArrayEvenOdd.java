package homework;


import java.util.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {

        int[] nums = {4, 7, 12, 19, 24, 39, 57, 69, 72, 84};
        int ctrEven = 0;
        int ctrOdd = 0;
        System.out.println("Original Array: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ctrEven++;
            } else {
                ctrOdd++;
            }
        }

        System.out.println("Number of even elements in the array : " + ctrEven);
        System.out.println("Number of odd elements in the array : " + ctrOdd);
    }
}
