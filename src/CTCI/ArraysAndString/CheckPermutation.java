package CTCI.ArraysAndString;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        String input1 = "asewrethusfyfiuysdkvsuyfcuib";
        String input2 = "yfiuysdkvsuyfcuibasewrethusf";
        boolean isPermutation = checkPermutation1(input1, input2);
        System.out.println("isPermutation : "+isPermutation);

    }

    private static boolean checkPermutation(String input1, String input2) {
        boolean isPermutation = false;
        if(input1 == null || input2 == null) return isPermutation;
        if(input1.length() != input2.length()) return isPermutation;
        int charArr[] = new int[26];
        for(int i = 0; i<input1.length(); i++){
            charArr[input1.charAt(i)-'a']++;
            charArr[input2.charAt(i)-'a']--;
        }
        for(int i = 0; i<26; i++){
            if(charArr[i] != 0){
                return isPermutation;
            }
        }
        return !isPermutation;
    }

    private static boolean checkPermutation1(String input1, String input2) {
        if(input1 == null || input2==null || input1.length() != input2.length()) return false;
        char[] in1 = input1.toCharArray();
        Arrays.sort(in1);
        char[] in2 = input2.toCharArray();
        Arrays.sort(in2);
        for(int i = 0; i<in1.length; i++){
            if(in1[i]!=in2[i]){
                return false;
            }
        }
        return true;
    }
}
