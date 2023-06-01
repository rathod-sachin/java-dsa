package strings;
public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(interpret(command));
    }
    static String interpret(String command){
        int n = command.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while(i<n){
            char ch = command.charAt(i);

            if(ch == 'G'){
                ans.append("G");
                i++;
            } else if(ch == '('){
                if(command.charAt(i+1) == ')'){
                    ans.append("o");
                    i = i + 2;
                } else {
                    ans.append("al");
                    i = i + 4;
                }
            }
        }
        return ans.toString();
    }
}
