package FirstSection;

import java.util.Arrays;

public class N167AllZeromoveToRight {
    public static void swap(int [] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static int[] allZerosMoveToRight(int[] arr){
        if(arr==null){
            throw new IllegalArgumentException("Array accept null ...");
        }
        boolean flag=true;
        while(flag) {
            flag=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i]==0 && arr[i+1]!=0){
                    flag=true;
                    swap(arr,i,i+1);
                }
            }
        }
        return arr;
    }
    public static void main(String []args){
        int[] arr={0,3,4,0,1,2,5,0};
        System.out.println(Arrays.toString(arr));
        allZerosMoveToRight(arr);
        System.out.println(Arrays.toString(arr));
    }
}
