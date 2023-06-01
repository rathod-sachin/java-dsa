package hash;

import java.util.HashMap;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,2,1,5,5,5,7,7,7,7,7};

        System.out.println(count(arr));
    }

    public static HashMap<Integer, Integer> count(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}
