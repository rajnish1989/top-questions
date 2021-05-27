package CTCI.ArraysAndString;

public class StringCompression {
    public static void main(String[] args) {
        String result = stringCompress("aabccccaaad");
        System.out.println(result);
    }

    private static String stringCompress(String s) {
        if(s==null || s.isEmpty() || s.isBlank()) return s;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);
        return sb.toString();
    }
}
