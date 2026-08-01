package StringsandStringBuilder;

public class PalindromeUsing2Pointer {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            // Skip non-alphanumeric characters on the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            // Skip non-alphanumeric characters on the right
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            // Compare characters ignoring case
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

