import itertools
from sys import stdin

def removeConsecutiveDuplicates(string) :
	# Your code goes here
     return (''.join(i for i, _ in itertools.groupby(string)))
	


#main
string = stdin.readline().strip()

ans = removeConsecutiveDuplicates(string)

print(ans)