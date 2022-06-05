package FirstSection;

import java.util.Arrays;

public class N131 {
    public static int removeDuplicates(int[]nums){
        if(nums==null)return 0;
        if(nums.length<=1)return 1;
        int current_pos=0;
        int moving_pos;
        for (moving_pos=1; moving_pos <nums.length ; moving_pos++) {
            if(nums[current_pos]!=nums[moving_pos]){
                nums[current_pos+1]=nums[moving_pos];
                current_pos++;
            }
        }
        return current_pos+1;
    }public static int removeDuplicates1(int[]nums){
        if(nums==null)return 0;
        if(nums.length<=1)return 1;
        int current=0;
        int size=nums.length;
        for (int i=0; i <size-1 ; i++) {
            if(nums[i]==nums[i+1]){}
            else {
                current++;
            }
        }return current+1;
    }

    public static void main(String[] args) {
        int []nums={1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates1(nums));
    }

}
