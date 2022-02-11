/*
560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/

class Solution {
  public int subarraySum(int[] nums, int k) {
      int n=nums.length;
      int count=0,sum=0;
      HashMap<Integer,Integer> m = new HashMap<>();
      //traverse the array and keep track of the current running sum up to ith index in a variable sum
      for(int i=0;i<n;i++){
          sum=sum+nums[i];
          if(sum==k){
              count++;
          }
          if(m.get(sum-k)!=null){
              count=count+m.get(sum-k);
          }
          if(m.get(sum)!=null){
              m.put(sum,m.get(sum)+1);
          }
          else{
              m.put(sum,1);
          }
  }
  return count;
  }
}
