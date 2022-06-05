package FirstSection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class N140 {
    public static void main(String[] args) {
        ArrayList<Interval> x=new ArrayList<>();
        x.add(new Interval(1,3));
        x.add(new Interval(2,100));
        x.add(new Interval(8,10));
        x.add(new Interval(15,18));
        x.add(new Interval(17,20));
        x=merge(x);
        for (Interval i:x) {
            System.out.println(i.getStart()+" "+ i.getEnd());
        }
    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals){
        if(intervals.size()==0 | intervals.size()==1)return intervals;
        Interval first=intervals.get(0);
        int start= first.getStart();
        int end = first.getEnd();
        Collections.sort(intervals,new ComparatorIntervals());
        ArrayList<Interval> result=new ArrayList<>();
        for (int i = 1; i <intervals.size() ; i++) {
            Interval current=intervals.get(i);
            if(current.getStart()<=end){
                end=Math.max(current.getEnd(),end);
            }
            else{
                result.add(new Interval(start,end));
                start= current.getStart();
                end=Math.max(current.getEnd(),end);

            }
        }
        result.add(new Interval(start,end));
        return result;
    }

}
class Interval{
    int start;
    int end;
    Interval(){
        start=0;
        end=0;
    }
    Interval(int s,int e){
        start=s;
        end=e;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
}
class ComparatorIntervals implements Comparator<Interval>{
    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.getStart()-o2.getStart();
    }
}