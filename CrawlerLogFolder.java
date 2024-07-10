/* https://leetcode.com/problems/crawler-log-folder/?envType=daily-question&envId=2024-07-10 */
/* 1598. Crawler Log Folder */

class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int ans = 0;
    for (final String log : logs) {
      if (log.equals("./"))
        continue;
      if (log.equals("../"))
        ans = Math.max(0, ans - 1);
      else
        ++ans;
    }
    return ans;
    }
}
