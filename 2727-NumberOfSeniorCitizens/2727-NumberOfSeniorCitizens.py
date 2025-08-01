# Last updated: 8/1/2025, 2:27:10 PM
class Solution:
    def countSeniors(self, details: List[str]) -> int:
        return sum(1 if int(a[11:13])>60 else 0 for a in details)
        