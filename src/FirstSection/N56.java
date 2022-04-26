package FirstSection;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class N56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),p=sc.nextInt(),count=0;
        for (int i = x; i <=y ; i++) {
            if(i%p==0)count++;
        }
        System.out.println(count);
    }
}
