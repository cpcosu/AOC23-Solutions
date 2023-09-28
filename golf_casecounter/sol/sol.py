def solve(a,b,line):
	result=["",""]
	for i in line:
		if ord(i)<=ord('Z') and ord(i)>=ord('A'):
			if a>0:
				a-=1
				result[0]+=i
		elif b>0:
			b-=1
			result[1]+=i
	return result

if __name__=='__main__':
	a,b=map(int, input().split())
	line=input()
	print("\n".join(solve(a,b,line)))