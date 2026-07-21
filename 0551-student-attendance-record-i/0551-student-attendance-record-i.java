class Solution {
    public boolean checkRecord(String s) {
        
        int aCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                aCount++;
            }
        }

        return aCount < 2 && !s.contains("LLL");
    }
}