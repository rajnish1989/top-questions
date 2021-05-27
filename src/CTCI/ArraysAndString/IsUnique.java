package CTCI.ArraysAndString;

public class IsUnique {
    public static void main(String[] args) {
        /*String test = "bcqwertya";
        int i;
        for(i = 0; i<test.length(); i++){
            if(test.indexOf(test.charAt(i)) != test.lastIndexOf(test.charAt(i))){
                System.out.println("String is not unique");
                break;
            }
        }
        if(i==test.length()){
            System.out.println("String is unique");
        }*/
        String test = "abcqwertya";
        int[] testArr = new int[26];
        for(char ch : test.toCharArray()){
            testArr[ch-'a']++;
        }
        for(int i = 0; i< 26; i++){
            if(testArr[i]>1){
                System.out.println("Duplicate");
                return;
            }
        }
        System.out.println("Not Duplicate");

    }
}
