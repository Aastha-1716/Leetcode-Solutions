import java.util.Scanner;

class Solution {

    public void moveZeroes(int[] nums) {

        int[] temp = new int[nums.length];

        int k = 0;

        // Store all non-zero elements in temp
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                temp[k] = nums[i];
                k++;
            }
        }

        // Copy temp array back to original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}

public class MoveZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        obj.moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}