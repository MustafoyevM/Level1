package FirstSection;

import java.util.Arrays;

public class N132 {
    public static int removeDuplicates(int[]nums)
    {
        int index=1;
        for (int i = 2; i <nums.length ; i++) {
            if(nums[i]!=nums[index] ||
                    (nums[index]==nums[i] &&nums[index-1]==nums[i])){
                index++;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3,4,5,6,7,7,7,7};
        System.out.println("Original array: "+ Arrays.toString(nums));
        System.out.println(removeDuplicates(nums));
    }
}
