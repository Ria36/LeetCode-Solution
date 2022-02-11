/*
567. Permutation in String

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 
Constraints:
1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map=new int[128];
        for(char c : s1.toCharArray()){
            map[c]++;
        }
        int count=s1.length();
        char[] ch = s2.toCharArray();
        int l=0,r=0;
        while(r<ch.length){
            if(map[ch[r++]]-->0)
                count--;
          //when all ch from s1 are used up,check sliding window is excatly the length of s1
            while(count==0){
                if(r-l==s1.length())
                    return true;
                if(++map[ch[l++]]>0)
                    count++;
            }
        }
        return false;
    }
}
