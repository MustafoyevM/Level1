package FirstSection;

import java.util.ArrayList;
import java.util.Scanner;

public class N123
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //todo solution 1
        int [] a={-2,1,-3,4};
        System.out.println(Min_Subarray(a));
        //todo solution2
        int n=sc.nextInt();
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        System.out.println(min_Subarray2(nums));
    }
    //todo for solution 2
    public static int min_Subarray2(ArrayList<Integer>nums){
        int nums1[]=new int[nums.size()];
        nums1[0]=nums.get(0);
        int min =nums1[0];
        for (int i = 1; i < nums.size(); i++)
        {
            nums1[i]=Math.min(nums.get(i),nums.get(i)+nums1[i-1]);
            min=Math.min(nums1[i],min);
        }
        return min;
    }




    //todo for solution 1
    public static int Min_Subarray(int [] ar){
        if(ar.length<1)return 0;
        int sum=0,
                begin=0,
                end=0,
                Min_begin=0,
                Min_end=0,
                mn=999999999,min=0;
        while (end < ar.length) {
            sum+=ar[end];
            if(sum<mn)mn=sum;
            if(sum>0){
                sum=0;
                begin=end+1;
            }
            else{
                if(min>sum){
                    min=sum;
                    Min_begin=begin;
                    Min_end=end;
                }
            }
            end++;
        }
        if(mn>0)min=mn;
        return min;
    }
}
