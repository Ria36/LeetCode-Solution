/* https://leetcode.com/problems/reverse-prefix-of-word/description/?envType=daily-question&envId=2024-05-01 */
/* 2000. Reverse Prefix of Word */

class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
         final int i = word.indexOf(ch) + 1;
    return new StringBuilder(word.substring(0, i)) //
        .reverse()                                 //
        .append(word.substring(i))                 //
        .toString();
    }
}

