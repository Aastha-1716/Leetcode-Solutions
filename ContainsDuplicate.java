import java.util.Scanner;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class ContainsDuplicate {

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

        boolean result = obj.containsDuplicate(nums);

        if (result) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

        sc.close();
    }
}