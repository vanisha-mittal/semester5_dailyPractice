# Last updated: 7/31/2025, 5:12:30 PM
class Solution:
    def minimumPushes(self, word: str) -> int:
        arr=[0]*26
        for i in range(26):
            arr[i]=word.count(chr(97+i))
        arr.sort(reverse=True)
        ans=0
        for i in range(26):
            if arr[i]==0:
                break
            ans+=(i//8+1)*arr[i]
        return ans

        
        