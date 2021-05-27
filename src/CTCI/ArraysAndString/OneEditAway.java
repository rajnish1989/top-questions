package CTCI.ArraysAndString;

public class OneEditAway {
    public static void main(String[] args) {
        System.out.println("String is oneEditAway : "+isOneEditAway("pale", "ple"));
        System.out.println("String is oneEditAway : "+isOneEditAway("pales", "pale"));
        System.out.println("String is oneEditAway : "+isOneEditAway("pale", "bale"));
        System.out.println("String is oneEditAway : "+isOneEditAway("pale", "bae"));
    }

    private static boolean isOneEditAway(String input1, String input2) {
        if(input1 == null || input2==null) return false;
        int charArray[] = new int[26];
        for(int i = 0; i< input1.length(); i++){
            charArray[input1.charAt(i)-'a']++;
        }
        for(int i = 0; i< input2.length(); i++){
            charArray[input2.charAt(i)-'a']--;
        }
        int totalDiff = 0;
        for(int i = 0; i<26; i++){
            if(charArray[i] > 1 || charArray[i] < -1){
                return false;
            } else if(charArray[i]!=0){
                totalDiff++;
            }
        }
        return totalDiff<=2;
    }


}
