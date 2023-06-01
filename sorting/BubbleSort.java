package sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,3,4,4,5};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}


//    int sum=0;
//    int sign=1;
//    Stack<Integer> st=new Stack<>();
//        for(int i=0;i<s.length();i++){
//        char x=s.charAt(i);
//        if(Character.isDigit(x)){
//        int num=0;
//        while(i<s.length() && Character.isDigit(s.charAt(i))){
//        num=num*10 + (s.charAt(i)-'0');
//        i++;
//        }
//        i--;
//        num=num*sign;
//        sum+=num;
//        sign=1;
//        }
//        else if(x=='('){
//        st.push(sum);
//        st.push(sign);
//        sum=0;
//        sign=1;
//        }
//        else if(x==')'){
//        sum*=st.pop();
//        sum+=st.pop();
//        }
//        else if(x=='-'){
//        sign*=-1;
//        }
//        }
//        return sum;
//
//        }
//        }