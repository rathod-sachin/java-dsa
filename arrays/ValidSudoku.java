package arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    // 36
    // https://leetcode.com/problems/valid-sudoku/
    public static void main(String[] args) {
//        char[][] arr = {{"5","3",".",".","7",".",".",".","."}
//                ,{"6",".",".","1","9","5",".",".","."}
//                ,{".","9","8",".",".",".",".","6","."}
//                ,{"8",".",".",".","6",".",".",".","3"}
//                ,{"4",".",".","8",".","3",".",".","1"}
//                ,{"7",".",".",".","2",".",".",".","6"}
//                ,{".","6",".",".",".",".","2","8","."}
//                ,{".",".",".","4","1","9",".",".","5"}
//                ,{".",".",".",".","8",".",".","7","9"}};


    }
    public static boolean isValid(char[][] arr){
        Set set = new HashSet<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++) {
                if(arr[i][j] != '.'){
                    if (!set.add("row" + i + arr[i][j]) ||
                        !set.add("col" + j + arr[i][j]) ||
                        !set.add("block" + (i/3)*3 + j/3 + arr[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
