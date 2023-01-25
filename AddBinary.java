/*
Add Binary
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 
Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

/* https://leetcode.com/problems/add-binary/description/ */

class AddBinary {
    public String addBinary(String a, String b) {
        int carry=0;
        StringBuilder s1=new StringBuilder(a);
        StringBuilder s2=new StringBuilder(b);
        StringBuilder res=new StringBuilder();
        s1.reverse(); 
        s2.reverse();
        int i=0,sum;
        while(i<a.length() || i<b.length())
        {
            sum= carry;
            if(i<a.length()) sum+= s1.charAt(i)-'0';
            if(i<b.length()) sum+= s2.charAt(i)-'0';
            if(sum==0) 
            {
                 carry=0;
                 res.append('0');
            }
            if(sum==1) 
            {
                 carry=0;
                 res.append('1');
             }
            if(sum==2)
            {
                carry=1;
                res.append('0');
            }
           if(sum==3) 
            {
                carry=1;
                res.append('1');
            }
            i++;
        }
    
        if(carry==1)   
        res.append('1');
        res.reverse();
        return res.toString();    
        }
}
