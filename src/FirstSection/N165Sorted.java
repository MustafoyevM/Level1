package FirstSection;

import java.util.Arrays;

public class N165Sorted
{
    public static void main(String []args){
        int [] nums={-2,3,4,-1,-3,1,2,-4,0};
        System.out.println(Arrays.toString(nums));
        System.out.print("sorted array");
        split_sorted_aaray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] split_sorted_aaray(int[] nums){
        if (nums == null) {
            throw new IllegalArgumentException("Null   array....");
        }
        boolean flag=true;

        while(flag){
            flag=false;
            for (int i = 0; i <nums.length-1 ; i++) {
                if(nums[i]>nums[i+1]){
                    flag=true;
                    swap(nums,i+1,i);
                }
            }
        }
        return nums;
    }
    public static void swap(int []arr,int right,int left){
        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
