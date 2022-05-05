package FirstSection;

import java.util.Scanner;
import static java.lang.Math.*;

public class N100 {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),n2=sc.nextInt(),count=0;
//        int[] ar=new int[n],ar2=new int[n2];
//        for (int i = 0; i < n; i++) {
//            ar[i]= sc.nextInt();
//        }
//        for (int i = 0; i < n2; i++) {
//            ar2[i]=sc.nextInt();
//            if(abs(ar2[i]-ar[i])<=1 &&abs(ar2[i]-ar[i])!=0){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
class Solution {
    public boolean solve(String s) {
        return backtrack(s, 0, null, 0);
    }
    public boolean backtrack(String s, int idx, Integer prev, int count) {
        if (idx == s.length())
            return count > 1;
        boolean res = false;
        for (int i = idx + 1; i < s.length() + 1; i++) {
            String sub = s.substring(idx, i);
            int curr = Integer.parseInt(sub);
            if (prev == null || prev - 1 == curr)
                res |= backtrack(s, i, curr, count + 1);
        }
        return res;
    }
}