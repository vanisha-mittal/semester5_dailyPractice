# Last updated: 8/2/2025, 4:04:44 PM
class Solution(object):
    def spiralOrder(self, ma):
        ans=[]
        m,n=len(ma),len(ma[0])
        t,b,l,r = 0,m-1,0,n-1
        while t<=b and l<=r:
            for i in range(l,r+1):
                ans.append(ma[t][i])
            t+=1
            if t>b:
                break
            for i in range(t,b+1):
                ans.append(ma[i][r])
            r-=1
            if r<l:
                break
            for i in range(r,l-1,-1):
                ans.append(ma[b][i])
            b-=1
            for i in range(b,t-1,-1):
                ans.append(ma[i][l])
            l+=1
        return ans
        
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        