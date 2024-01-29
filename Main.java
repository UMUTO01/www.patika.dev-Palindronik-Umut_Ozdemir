public class Main {
    public static void main(String[] args) {
        String[] words = {"level", "world", "racecar", "java", "madam"};

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1; 

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}