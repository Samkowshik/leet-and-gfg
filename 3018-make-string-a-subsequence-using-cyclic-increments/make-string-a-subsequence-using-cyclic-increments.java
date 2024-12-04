class Solution {
    public boolean canMakeSubsequence(String str1, String str2) 
    {
        int i=0;
        for(char c: str1.toCharArray())
        {
            if(c==str2.charAt(i) || c+1==str2.charAt(i) || (c=='z' && str2.charAt(i)=='a'))
                i++;
            if(i==str2.length()) return true;
        }

        return false;
    }
}