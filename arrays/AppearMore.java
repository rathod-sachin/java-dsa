package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AppearMore {
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,1,1,2,2};

        System.out.println(more(arr));

    }
    public static int more(int[] arr){
        int majo = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){

            if(arr[i] == majo){
                count++;
            } else {
                count--;
                if(count==0){
                    majo = arr[i];
                    count = 1;
                }
            }
        }
        return majo;
    }
}
