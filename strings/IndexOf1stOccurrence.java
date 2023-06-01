package strings;

public class IndexOf1stOccurrence {
    // 28
    public static void main(String[] args) {
        System.out.println(firstOccurrence("leetcode", "tco"));
    }
    public static int firstOccurrence(String s1, String s2){
        if(s1 == null || s2 == null){
            return -1;
        }
        int n1 = s1.length();
        int n2 = s2.length();

        for(int i=0; i<n1-n2+1; i++){
            int count = 0;

            while (count < n2 && s2.charAt(count) == s1.charAt(count + i)){
                count++;
                if (count == n2){
                    return i;
                }
            }
        }
        return -1;
    }
}
