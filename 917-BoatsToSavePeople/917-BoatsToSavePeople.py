# Last updated: 7/31/2025, 5:19:36 PM
class Solution(object):
    def numRescueBoats(self, people, limit):
        people.sort()
        b=0
        l,r=0,len(people)-1
        while l<=r:
            if people[l]+people[r]<=limit:
                l+=1
            r-=1
            b+=1
        return b
        """
        :type people: List[int]
        :type limit: int
        :rtype: int
        """
        