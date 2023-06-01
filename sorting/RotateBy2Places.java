package sorting;

public class RotateBy2Places {
    // https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1
    // 2 method
    public static void main(String[] args) {
        String a = "amazon";
        String b = "onamaz";
        System.out.println(isValid(a, b));
    }
    public static boolean isValid(String a, String b){
        int n = a.length();
        StringBuilder ans = new StringBuilder();
        int j = 2;

        while (j< a.length()){
            ans.append(a.charAt(j));
            j++;
        }
        ans.append(a.charAt(0));
        ans.append(a.charAt(1));
        if(b.equals(ans.toString())){
            return true;
        }
        ans.delete(0,ans.length());
        j = 0;
        ans.append(a.charAt(n-2));
        ans.append(a.charAt(n-1));
        while (j < a.length()-2){
            ans.append(a.charAt(j));
            j++;
        }
        return b.equals(ans.toString());
    }
}
//    public static boolean isValid(String a, String b){
//        if(a.length() != b.length()){
//            return false;
//        }
//        if (antiClockWise(a, b)){
//            return true;
//        }
//        return clockWise(a, b);
//    }
//    public static boolean antiClockWise(String a, String b){
//        int i = 2;
//        int j = 0;
//
//        while (i < a.length() && j < b.length()){
//            if(a.charAt(i) != b.charAt(j)){
//                return false;
//            }
//            i++;
//            j++;
//        }
//        return a.charAt(0) == b.charAt(b.length() - 2) && a.charAt(1) == b.charAt(b.length() - 1);
//    }
//    public static boolean clockWise(String a, String b){
//        int i = 0;
//        int j = 2;
//
//        while (i < a.length() && j < b.length()){
//            if(a.charAt(i) != b.charAt(j)){
//                return false;
//            }
//            i++;
//            j++;
//        }
//        return a.charAt(a.length() - 2) == b.charAt(0) && a.charAt(a.length() - 1) == b.charAt(1);
//    }
//}