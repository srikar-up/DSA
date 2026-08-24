import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int n = s.length();
        int r = 0;
        HashSet<Character> st = new HashSet<>();
        int maxl = 0;

        while (r < n) {

            while (st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            }

            st.add(s.charAt(r)); 
            
         
            maxl = Math.max(maxl, r - l + 1); 
            r++;
        }
        return maxl;
    }
}

