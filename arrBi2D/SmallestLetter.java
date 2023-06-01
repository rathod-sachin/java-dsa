public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','b','d','e','f','z'};
        char tar = 'd';
        System.out.println(smallest(arr,tar));

    }
    static char smallest(char[] arr, char tar){

        int s = 0;
        int end = arr.length-1;

        while (s<=end){
            int mid = (s+end)/2;

            if(tar<arr[mid]){
                end = mid-1;
            } else {
                s = mid +1;
            }
        }
        return arr[s%arr.length];
    }
}
