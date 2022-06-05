package FirstSection;

public class N124
{
    public static void main(String[] args) {
        //todo solution 1
        int a[]={1,2,4,5,6};
        System.out.println(findNumberFrommindx(a,99));

        //todo solution 2
        System.out.println(searchInsert(a,7));

    }
    public static int searchInsert(int[] arr,int target){
        if(arr==null || arr.length==0)
            return 0;
        int start=0,end=arr.length-1,mid;
        while (start + 1 < end) {
            mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)start=mid;
            else end=mid;
        }
        if(arr[start]>=target)return start;
        else if(arr[start]<target && target<=arr[end])return end;
        else return 0;

    }







    // to todo solution 1
    public static int findNumberFrommindx(int []arr,int target){
        String a="";
        for (int i = 0; i < arr.length; i++) {
            a+=arr[i];
        }
        int foundNum=0;
        if(a.contains(""+target)){
            foundNum=a.indexOf(""+target);
        }
        return foundNum;
    }
}
