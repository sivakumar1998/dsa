package udemy.prateek.arrays;

public class MaximumSubArraySum {
    static void main(String[] args) {
        int nums[] = {-1, 2, -1, 4, 5};
        System.out.println(getMaximumSubArraySum(nums));
    }

    public static int getMaximumSubArraySum(int nums[]) {
        int maximumSubArraySum = 0;

        if (nums != null && nums.length == 0) {
            return maximumSubArraySum;
        }
        int currentSum = nums[0];
        maximumSubArraySum = nums[0];
        for (int start = 1; start < nums.length; start++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
                currentSum += nums[start];
                if (currentSum > maximumSubArraySum) {
                    maximumSubArraySum = currentSum;
                }


        }

        return maximumSubArraySum;
    }
}
