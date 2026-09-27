class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            
            for(int j = 0; j < needle.length(); j++)
            {
                if(haystack.charAt(i + j) != needle.charAt(j))
                    break;        
                
                if(needle.length() == 0)
                return -1;
            }
        }
        return -1;
    }
}