package string;

public class VowelFetcher {
    public static void main(String[] args) {
        String input = "HeLlO pAtTeRn PrOgRaMmInG";
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (isVowel(ch)){
                System.out.print(ch+"  ");
            }
        }
    }

    public static boolean isVowel(char c){
        char[] chArr = {'a','e','i','o','u','A','E','I','O','U'};

        for (char vowel : chArr){
            if (c == vowel){
                return true;
            }
        }
        return false;
    }
}
