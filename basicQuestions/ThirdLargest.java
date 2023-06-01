package basicQuestions;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {-2,3,-4,0,23,12};

        System.out.println(thirdLargest(arr));
    }
    public static int thirdLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if(arr[i] > third && arr[i] != second){
                third = arr[i];
            }
        }
        return third;
    }
}
