// Last updated: 12/5/2025, 7:21:51 PM
1class Solution {
2	public boolean isAdditiveNumber(String num) {
3		long number1=0;
4		for(int i=0; i<num.length()-1; i++){
5			number1=number1*10+num.charAt(i)-'0';
6			long number2=0;
7			for(int j=i+1; j<num.length(); j++){
8				number2=number2*10+num.charAt(j)-'0';
9				if(solv(number1, number2, j+1, num, 2))
10					return true;
11				if(number2==0)
12					break;
13			}
14			if(number1==0)
15				break;
16		}
17		return false;
18	}
19	boolean solv(long number1, long number2, int curr, String num, int count) {
20		if(curr>=num.length()){
21			if(count>=3)
22				return true;
23			return false;
24		}
25		if(num.charAt(curr)=='0' && number1+number2!=0)
26			return false;
27    
28		long number=0;
29		long target=number1+number2;
30		for(int i=curr; i<num.length(); i++) {
31			number=number*10+num.charAt(i)-'0';
32			if(number==target && solv(number2, target, i+1, num, count+1))
33				return true;
34			else if(number>target)
35				break;
36		}
37		return false;
38	}
39}