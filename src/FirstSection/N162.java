package FirstSection;

public class N162 {
    public static void main(String[] args) {
        int arr[]={1,4,17,7,25,3,100};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        double avarage=sum/arr.length;
        for (int i = 0; i <arr.length; i++) {
            if(avarage<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
