package strings;

public class ExcelSheet {
    // 171
    public static void main(String[] args) {
        System.out.println(column("AB"));
    }
    public static int column(String s){
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            ans = (ans * 26) + s.charAt(i) - 'A' + 1;
        }
        return ans;
    }
}
