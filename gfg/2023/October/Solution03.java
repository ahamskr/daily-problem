// Column name from a given column number

class Solution03
{
    String colName (long n)
    {
        // your code here
        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            n--;
            ans.append((char) ('A' + n % 26));

            n = n / 26;
        }
      return ans.reverse().toString();
    }
}