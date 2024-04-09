/* https://leetcode.com/problems/time-needed-to-buy-tickets/description/?envType=daily-question&envId=2024-04-09 */
/* 2073. Time Needed to Buy Tickets */

class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
    int ans = 0;

    for (int i = 0; i < tickets.length; ++i)
      if (i <= k)
        ans += Math.min(tickets[i], tickets[k]);
      else
        ans += Math.min(tickets[i], tickets[k] - 1);

    return ans;
    }
}
