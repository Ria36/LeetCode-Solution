/*
Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
 
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 
Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/
/* https://leetcode.com/problems/ransom-note/description/ */

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Take length of first string
		int l1 = ransomNote.length();
		// Take length of second string
		int l2 = magazine.length();
		// Check if length of first string is greater than length of second string
		if (l1 > l2)
			// terminate execution as basic condition fails
			return false;
		// Iterate char by char of first string
		char[] ransomNoteChars = ransomNote.toCharArray();
		for (char charOfransomNote : ransomNoteChars) {
			// Check char is present in magazine string
			if (magazine.contains(Character.toString(charOfransomNote)))
				// If magazine contains char, replace that with empty string. 
				// I am using replaceFirst method to replace only first occurrence. 
				magazine = magazine.replaceFirst(Character.toString(charOfransomNote), "");
			else
				// If char is not present in magazine string then return false
				return false;
		}
		// If iteration is completed for each char it means all chars of ransom note is present in magazine note. 
		return true;
    }
}
