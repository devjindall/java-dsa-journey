// Last updated: 4/22/2026, 9:08:35 PM
class Solution {
 public:
  void reverseString(vector<char>& s) {
    int l = 0;
    int r = s.size() - 1;

    while (l < r)
      swap(s[l++], s[r--]);
  }
};