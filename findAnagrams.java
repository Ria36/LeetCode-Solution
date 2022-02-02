/* 
438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 
Constraints:
1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length())
            return res;
      
        //Using hashmap to store the character which appears in p string.And the integer for how many times certain char left to use.
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        
        char[] arr=s.toCharArray();
        
        for(char c : p.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            char c = arr[i];
            m.put(c,m.getOrDefault(c,0)-1);
            
        if(m.get(c)==0){
            m.remove(c);
        }
            
            if(i>=p.length()){
                char rem=arr[i-p.length()];
                m.put(rem,m.getOrDefault(rem,0)+1);
                if(m.get(rem)==0){
                    m.remove(rem);
                }
            }
            
            if(m.size()==0){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}
