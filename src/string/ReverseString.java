package string;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "It is a beautiful day out";
        String reverseString = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverseString += sentence.charAt(i);
        }
        String[] arr = reverseString.split(" ");
        String reverseSentence = "";
        for (int i=arr.length-1;i>=0;i--){
            reverseSentence+=arr[i]+" ";
        }
        reverseSentence=reverseSentence.trim();
        System.out.println(reverseSentence);
    }
}
