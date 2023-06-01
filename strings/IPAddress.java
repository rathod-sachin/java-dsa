package strings;
public class IPAddress {
    public static void main(String[] args) {
        String str = "255.100.50.0";

        System.out.println(isPalindrome(str));
    }
    static String isPalindrome(String address){
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<address.length(); i++){

            if(address.charAt(i) == '.'){
                builder.append("[.]");
            } else {
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}
