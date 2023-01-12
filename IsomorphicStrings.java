/*
Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 
Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
 
Constraints:
1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
/* Create a hashmap of (char, char) to store the mapping of s and t */
        HashMap<Character,Character> hm = new HashMap();
/*Now traverse on the string and check whether the current character is present in the Hashmap.
If it is present then the character that is mapped is there at the ith index or not.
Else check if str2[i] is not present in the key then add the new mapping.
Else return false. */
        char c='a';
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                c=hm.get(s.charAt(i));
                if(c!=t.charAt(i))
                return false;
            }
            else if(!hm.containsValue(t.charAt(i))){
                hm.put(s.charAt(i),t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
