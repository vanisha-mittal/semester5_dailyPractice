# Last updated: 8/2/2025, 4:05:32 PM
class Solution(object):
    def longestCommonPrefix(self, strs):
        pref = strs[0]
        pref_len = len(pref)

        for s in strs[1:]:
            while pref != s[0:pref_len]:
                pref_len -= 1
                if pref_len == 0:
                    return ""
                
                pref = pref[0:pref_len]
        
        return pref

        """
        :type strs: List[str]
        :rtype: str
        """
        