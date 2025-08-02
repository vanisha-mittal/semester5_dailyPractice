# Last updated: 8/2/2025, 4:04:24 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        l=len(digits)
        for i in range(-1,-l-1,-1):
            if digits[i]==9:
                digits[i]=0
            else:
                digits[i]=digits[i]+1
                return digits
        return [1]+digits

        