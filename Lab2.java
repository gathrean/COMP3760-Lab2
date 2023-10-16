import java.util.ArrayList;

/**
 * The Grand Witch's request (demand).
 * <p>
 * She wants tp see coloured light strings displaying palindromes,
 * and she wants to see all the possible palindromes.
 */
public class Lab2 {
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
        int n = 3;
        ArrayList<String> palindromes = lab.generatePalindromeSequences(n);
        System.out.println(palindromes);
    }

    public ArrayList<String> generatePalindromeSequences(int n) {
        ArrayList<String> result = new ArrayList<>();
        generatePalindromes(n, "", result);
        return result;
    }

    private void generatePalindromes(int n, String current, ArrayList<String> result) {
        if (current.length() == n) {
            if (isPalindrome(current))
                result.add(current);
        } else {
            for (char c = 'A'; c <= 'C'; c++) {
                generatePalindromes(n, current + c, result);
            }
        }
    }

    private boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}