package FirstSection;

public class N122 {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -3, 4, -1, 2, 1, -5, -4};
        System.out.println(max_SubArray(nums));
    }
    public static int max_SubArray(int[]nums){
        if (nums.length<1)return 0;
        int max=nums[0];
        int Max_Begin=0;
        int Max_End=0;
        int begin=0;
        int end=0;
        int sum=0;
        int mx=-999999999;

        while (end < nums.length)
        {
            sum+=nums[end];
            if(sum>mx)mx=sum;
            if(sum<0){
                sum=0;
                begin=end+1;
            }
            else
            {
                if (sum > max) {
                    max = sum;
                    Max_Begin = begin;
                    Max_End = end;
                }
            }
            ++end;
        }
        if(mx<0)max=mx;
        return max;
    }
}
