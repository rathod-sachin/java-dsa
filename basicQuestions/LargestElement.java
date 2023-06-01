package basicQuestions;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {-2,3,-4,0,23,12,4};

        System.out.println(largest(arr));
    }
    public static int largest(int[] arr){
        int max = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
