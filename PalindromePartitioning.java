/*
Palindrome Partitioning
Given a string s, partition s such that every substringof the partition is a palindrome. Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]
 
Constraints:
1 <= s.length <= 16
s contains only lowercase English letters.
*/

class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
	         backtrack(list,new ArrayList<String>(),0,s);
	        return list;
	    }
        
	    private void backtrack(List<List<String>> list, List<String> sublist, int index, String s){
	        if(index == s.length())
	            list.add(new ArrayList<>(sublist));
	        else{
	            for(int i = index; i < s.length(); i++){
                    if(isPalindrome(s, index, i)){
                        sublist.add(s.substring(index,i+1));
                        backtrack(list,sublist,i+1,s);
                        sublist.remove(sublist.size() - 1);      
                    }
                }
      
	        }
	    }
    private boolean isPalindrome(String s, int lo, int hi) {
        while(lo < hi) {
            if(s.charAt(lo++) != s.charAt(hi--)) return false;
        }
        return true;
    } 
}
