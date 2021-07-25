package jzoffer;

/**
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author dingshuangen
 */
public class RepeatNumber {

    /**
     * n个数字，范围0-n，通过置换，将每个数字放到和下标相等的位置 nums[i] == i;
     * [2, 3, 1, 0, 2, 5, 3]
     * 1-[1, 3, 2, 0, 2, 5, 3]
     * 2-[1, 0, 2, 3, 2, 5, 3]
     * 3-[1, 2, 0, 3, 2, 5, 3]
     * 4-[1, 2, 0, 3, 2, 5, 3] return 2
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {

        if (nums == null) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            //在正确的下标位置
            if (nums[i] == i) {
                continue;
            }
            //当前数字和正确下标位置的数字相同，重复
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            //交换
            int curr = nums[i];
            nums[i] = nums[curr];
            nums[curr] = curr;
        }

        return -1;
    }
}