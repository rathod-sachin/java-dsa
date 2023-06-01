package strings;

public class IntegerToRoman {
    public static void main(String[] args) {
        String s = "MCCXXI";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s){

        int ans = 0;
        int preValue = 0;

        for(int i=s.length()-1; i>=0; i--){
            int currValue = value(s.charAt(i));
            if(i+1 < s.length()){
                if(currValue < preValue) {
                    ans = ans - currValue;
                } else {
                    ans = ans + currValue;
                }
            } else
                ans = ans + currValue;
            preValue = currValue;

        }
        return ans;
    }
    static int value(char ch) {

        int ans = 0;

        switch (ch){
            case 'I' : ans = 1;break;
            case 'V' : ans = 5;break;
            case 'X' : ans = 10;break;
            case 'L' : ans = 50;break;
            case 'C' : ans = 100;break;
            case 'D' : ans = 500;break;
            case 'M' : ans = 1000;break;
        }
        return ans;
    }
}
