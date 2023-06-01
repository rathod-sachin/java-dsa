import java.util.Arrays;

public class SerZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
        System.out.println(Arrays.toString(matrix));
    }

   static public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 1;
        int y = 1;

        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0)
                y = 0;
        }
        for(int j=0; j<n; j++){
            if(matrix[0][j] == 0)
                x = 0;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<n; i++){
            if(matrix[i][0] == 0){
                for(int j=0; j<n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j=1; j<n; j++){
            if(matrix[0][j] == 0){
                for(int i=0; i<m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(y==0){
           for(int i=0; i<m; i++){
               matrix[i][0] = 0;
           }
        }
        if(x==0){
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
