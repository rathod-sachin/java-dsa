public class NonRepeatingArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3,7,3,7,5};

        System.out.println(firstNonRepeating(arr));

    }

    static int firstNonRepeating(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<n; j++){

                if( i != j & arr[i] == arr[j]){
                    break;
                }
            }
            if(j == n){
                return arr[i];
            }
        }
        return 0;
    }
}