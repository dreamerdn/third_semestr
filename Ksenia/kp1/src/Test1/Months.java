package Test1;

import java.io.IOException;
import java.util.Scanner;

public class Months {
    String name;

    Months(String month){
        name=month;
    }

    void show(Months[] arr,int[] arr2, int i){
        int i2=i+1;
        System.out.println("Month "+i2+": "+arr[i].name+" - "+arr2[i]);

    }

    public static int Count(int[] arr2){
        int sum=0;
        int cnt;
        for(int i=0;i<12;i++){
            sum+=arr2[i];
        }
        cnt=sum/12;

        return cnt;
    }
}
