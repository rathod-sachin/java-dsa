package arrBi2D;
import java.util.Arrays;

public class Balloon {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'b', 'c', 'c', 'c','a', 'f', 'c'};

        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        int sum = 1;
        for(int i=0; i<arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                    sum = count;
                }
            }
            if(sum % 2 != 0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
