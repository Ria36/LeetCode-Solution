/* https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/?envType=daily-question&envId=2024-09-02 */
/* 1894. Find the Student that Will Replace the Chalk */

class FindTheStudentThatWillReplaceTheChalk {
  public int chalkReplacer(int[] chalk, int k) {
    k %= Arrays.stream(chalk).asLongStream().sum();
    if (k == 0)
      return 0;
    for (int i = 0; i < chalk.length; ++i) {
      k -= chalk[i];
      if (k < 0)
        return i;
    }
    throw new IllegalArgumentException();
  }
}
