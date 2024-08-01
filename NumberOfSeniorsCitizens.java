/* https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01 */
/* 2678. Number of Senior Citizens */

class NumberOfSeniorsCitizens {
  public int countSeniors(String[] details) {
    return (int) Arrays.stream(details)
        .filter(detail -> Integer.parseInt(detail.substring(11, 13)) > 60)
        .count();
  }
}
