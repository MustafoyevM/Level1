package FirstSection;

import java.util.Arrays;
import java.util.Collections;

public class N159kLargestElement {
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
}
//todo some incomplete
  /*  public static void main(String[] args) {
        int []arr={1, 4, 17, 7, 25, 3, 100};
        int []s=KlargestE(arr,3);
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
    }

    public static int [] KlargestE(int []array,int k){
        List1 root=new List1(array[0]);
        int [] narr=new int[k];
        List1 temp=root;
        for (int i = 1; i < array.length; i++) {
            temp.next=new List1(array[i]);
            temp=temp.next;
        }
        Arrays.fill(narr,-999999999);
        for (int i = 0; i < k; i++) {
            List1 temp2=root;
            while(temp2!=null){
                if(temp2.a>narr[i]) {
                    narr[i] = temp2.a;
                }
                temp2=temp2.next;
            }List1 temp3=root;
            while(temp3!=null){
                if(temp3.a==narr[i]){
                    List1 h,h1=root;
                    h=temp3.next;
                    temp3=null;
                    temp3.next=new List1(h.a);
                    temp3=h.next;
                    break;
                }
                temp3=temp3.next;
            }

        }
return narr;
    }
}
class List1{
    List1 next;
    List1 old;
    int a;
    public List1(int value){
        a=value;
        next=null;
    }
}*/