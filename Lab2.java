import java.util.ArrayList;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public ArrayList<String> generatePalindromeSequences(String s) {
        ArrayList<String> result = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return result;
        }
        helper(s, 0, new ArrayList<String>(), result);
        return result;
    }

    private void helper(String s, int i, ArrayList<String> strings, ArrayList<String> result) {
    }
}

