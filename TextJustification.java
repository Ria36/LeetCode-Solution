/* Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left-justified, and no extra space is inserted between words.

Note:
A word is defined as a character sequence consisting of non-space characters only.
Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
The input array words contains at least one word.
 
Example 1:
Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]

Example 2:
Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
Note that the second line is also left-justified because it contains only one word. */

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultString = new ArrayList<>();
        int length = words.length;
        int index = 0;
        while(index < length){
            int totalChars = words[index].length();
            int lastIndex = index + 1;
            int gaps = 0;
            while(lastIndex < length){
                if(totalChars+1+words[lastIndex].length()>maxWidth){
                    break;
                }
                totalChars+=1+words[lastIndex++].length();
                gaps++;
            }
            StringBuilder sb = new StringBuilder();
            if(lastIndex==length || gaps==0){
                for(int i=index;i<lastIndex;i++){
                    sb.append(words[i]).append(' ');
                }
                sb.deleteCharAt(sb.length()-1);
                while(sb.length()<maxWidth){
                    sb.append(' ');
                }
            }
            else{
                int spaces = (maxWidth-totalChars)/gaps;
                int restSpaces = (maxWidth-totalChars)%gaps;
                for(int i=index;i<lastIndex-1;++i){
                    sb.append(words[i]).append(' ');
                    for (int j = 0; j < spaces + (i - index < restSpaces ? 1 : 0); ++j){
                        sb.append(' ');
                    }
                }
                sb.append(words[lastIndex-1]);
            }
            resultString.add(sb.toString());
            index = lastIndex;
        }
        return resultString;
    }
}
