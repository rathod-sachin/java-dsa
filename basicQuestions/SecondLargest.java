package basicQuestions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {-2,3,-4,0,23,12,4};

        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }
}