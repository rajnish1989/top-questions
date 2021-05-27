package CTCI.ArraysAndString;

import java.util.HashMap;
import java.util.Locale;

public class PelindromicPermutation {
    public static void main(String[] args) {
        String input = "Tact Coa";
        boolean res = isPelindromic(input);
        System.out.println("isPelindromic : "+res);
    }

    private static boolean isPelindromic(String input) {
        input = input.toLowerCase();
        HashMap<Character, Integer> freq  = new HashMap<>();
        for(char ch : input.toCharArray()){
            if(ch == ' ')
                continue;
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        int oddCount = 0;
        for(char ch: freq.keySet()){
            if(freq.get(ch)%2 != 0){
                oddCount++;
            }
        }
        return oddCount==1;
    }
}
