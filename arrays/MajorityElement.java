package arrays;

public class MajorityElement {
    // https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
    // 169
    public static void main(String[] args){
        int[] arr = {4,1,4,4,4,3,4,2,1};

        System.out.println(majority(arr));
    }
    public static int majority(int[] arr){
        int majority = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == majority){
                count++;
            } else {
                count--;
                if(count == 0){
                    majority = arr[i];
                    count = 1;
                }
            } // if majority is 100% exists than return majority directly from here... don't do further
        }
        int finalCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == majority){
                finalCount++;
            }
        }
        if(finalCount > arr.length / 2){
            return majority;
        }
        return -1;
    }
}
