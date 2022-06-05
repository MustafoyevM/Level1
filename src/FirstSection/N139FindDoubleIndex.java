package FirstSection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class N139FindDoubleIndex {
    public static List<Integer> SubArraySum(int []numbers){
        List<Integer> list=new ArrayList<>();
        if(numbers==null || numbers.length==0){
            return list;
        }
        int SumArr=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(SumArr,-1);
        for (int i = 0; i <numbers.length; i++) {
            SumArr+=numbers[i];
            if(map.containsKey(SumArr)){
                list.add(map.get(SumArr)+1);
                list.add(i);
                return list;
            }
            map.put(SumArr,i);

        }
        return list;
    }
    public static String findDoubleIndexes(int [] numbers){
        int beginner=0;
        int ending=0;

        for (; beginner < numbers.length ; beginner++) {
            int sum=numbers[beginner];
            for (int i = beginner+1; i<numbers.length; i++) {
                sum+=numbers[i];
                if(sum==0){
                    ending=i;

                    return "["+beginner+":"+ending+"]";
                }


            }

        }
        return "["+beginner+":"+ending+"]";
    }
    public static void main(String []args){
        int[]a={1, 2, 3, -5, 5, 4,-9};
        System.out.println(findDoubleIndexes(a));
        System.out.print(SubArraySum(a));
    }
}
