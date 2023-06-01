package hash;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,2,1,5,5,5,7,7,7,7,7};

        System.out.println(unique(arr));
    }
    public static boolean unique(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for(int i : map.values()){
            if (!set.add(i)){
                return false;
            }
        }
        return true;
    }
}
