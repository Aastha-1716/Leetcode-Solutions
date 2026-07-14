import java.util.Scanner;

class Solution {

    public int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {

                if (nums[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k] = nums[i];
                k++;
            }
        }

        // Copy unique elements back to original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
}

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
