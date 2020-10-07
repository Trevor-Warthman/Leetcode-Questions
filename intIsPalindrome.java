//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

class Solution {
    public boolean isPalindrome(int x) {
        //return true if 1 digit
        if (x >= 0 && x < 10) {
            return true;
        }
        //Convert to str
        String number = Integer.toString(x);
        int len = number.length();
        //Set even or odd length
        boolean even = true;
        if(len % 2 != 0){
            even = false;
        }
        //handle all except middle 1 or 2 characters
        for (int i = 0; i < (len - 1) / 2;i++){
            //if char at index i and index (length - i) don't match: problem.
            if(number.charAt(i) != number.charAt(len - i - 1)){
                return false;
            }
        }
        //get last 1 or 2 characters
        if(even){
            if(number.charAt(len/2 - 1) != number.charAt(len/2)){
                return false;
            }
        }
        //if odd we don't care what the middle is
        return true;
    }
}
