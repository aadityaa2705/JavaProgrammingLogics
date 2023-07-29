package string;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String name = "java";
        String surName = "program";
        String result = removeDuplicates(name,surName);
        System.out.println(result);
    }

    public static String removeDuplicates(String string1, String string2){
        String result="";

        char[] string2Chars = string2.toCharArray();

        for (int i=0; i<string1.length();i++){
            char string1Char = string1.charAt(i);
            boolean isDuplicate = false;
            for (char ch : string2Chars){
                if (ch == string1Char){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate)
                result += string1Char;
        }
        return result;
    }
}
