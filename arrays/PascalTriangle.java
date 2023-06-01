package arrays;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {

        System.out.println(pascal(5));
    }
    public static ArrayList<ArrayList<Integer>> pascal(int numRows){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> pre = null;

        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                } else {
                    list.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = list;
            result.add(list);
        }
        return result;
    }
}
