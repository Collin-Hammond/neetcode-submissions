class Solution {
    public boolean isPalindrome(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        
        while(left < right){
            if(!(Character.isLetterOrDigit(chars[left]))){
                left++;
                continue;
            }else if(!(Character.isLetterOrDigit(chars[right]))){
                right--;
                continue;
            }

            if(Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])){
                return false;
            }

            left++;
            right--;

        }
        return true;
        
    }
}