class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean case1 = word.equals(word.toUpperCase());
        boolean case2 = word.equals(word.toLowerCase());
        boolean case3 = Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
    
        return case1 || case2 || case3;
        
    }
}