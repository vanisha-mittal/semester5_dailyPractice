# Last updated: 8/2/2025, 4:04:46 PM
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d={}
        for i in strs:
            s=''.join(sorted(i))
            if s not in d:
                d[s]=[]
                d[s].append(i)
            else:
                d[s].append(i)
        return list(d.values())
        