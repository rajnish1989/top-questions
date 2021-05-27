package CTCI.ArraysAndString;

import java.util.Locale;

public class URLify {
    public static void main(String[] args) {
        char[] input = "Mr John Smith    ".toCharArray();
        int num = 13;
        System.out.println(performURLify(input, num));
    }

    private static String performURLify(char[] input, int num) {
        int spaceCount = 0;
        for(int i = 0; i<num; i++){
            if(input[i]==' '){
                spaceCount++;
            }
        }
        int index = num+spaceCount*2-1;
        for(int i = num-1; i>=0; i--){
            if(input[i] == ' '){
                input[index--] = '0';
                input[index--] = '2';
                input[index--] = '%';
            } else {
                input[index--]=input[i];
            }
        }
        return String.valueOf(input);
    }
}
