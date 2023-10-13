//Given an integer x, return true if x is a palindrome, and false otherwise.

//package leetcode_questions;

class Solution {
    public boolean isPalindrome(int x) {
        int reverser = 0;
        int original = x;
        if(x<0){
            return false;
        }
        while(x>0){
        int lastdigit = x%10;
        reverser = reverser*10 + lastdigit;
            x=(x/10);
        }
        
        
        return original==reverser;
 
    }
}
