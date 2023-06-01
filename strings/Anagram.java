package strings;

public class Anagram {
    // 242
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t){
        int[] ans = new int[26];

        for(int i=0; i<s.length(); i++){
            ans[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            ans[s.charAt(i) - 'a']--;
        }
        for(int i : ans){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
