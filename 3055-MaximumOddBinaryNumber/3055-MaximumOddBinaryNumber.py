# Last updated: 7/31/2025, 5:12:53 PM
class Solution(object):
    def maximumOddBinaryNumber(self, s):
        ones = s.count('1')
        return '1' * (ones-1) + '0' * (len(s) - ones) + '1'
        
        