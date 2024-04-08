/* https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/?envType=daily-question&envId=2024-04-08 */
/* 1700. Number of Students Unable to Eat Lunch */
class StudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
    int[] count = new int[2];

    for (final int student : students)
      ++count[student];

    for (int i = 0; i < sandwiches.length; ++i) {
      if (count[sandwiches[i]] == 0)
        return sandwiches.length - i;
      --count[sandwiches[i]];
    }

    return 0;
    }
}
