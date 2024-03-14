package dev.rodrigoazlima.study.question.text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PalindromiTextIdentifier {
    public static void main(String[] args) {
        String s;
        boolean isPalindromic;
        // Case 1
        s = "PalaP";
        isPalindromic = isPalindromic(s);
        System.out.println(s + ":" + isPalindromic);
        // Case 2
        s = "NotValid";
        isPalindromic = isPalindromic(s);
        System.out.println(s + ":" + isPalindromic);
        // Case 3
        s = " A man, a plan, a canal: Panama\n";
        isPalindromic = isPalindromic(s);
        System.out.println(s + ":" + isPalindromic);

    }

    /**
     * Test if
     * <p>
     * Time: O(n/2)
     *
     * @param str
     * @return
     */
    public static boolean isPalindromic(String s) {
        String str = s.toLowerCase().replaceAll("[\\W_]+", "");
        System.err.println("isPalindromic(\"" + str + "\")");
        int length = str.length();
        int middleLength = length / 2; // The cast to integer removes the need to check for odd value
        for (int i = 0; i < middleLength; i++) {
            char left = str.charAt(i);
            char right = str.charAt(length - i - 1);
            System.err.println("[" + i + "]" + left + " == " + right + "[" + (length - i - 1) + "]");
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}