


def solve(l):
    
    l.sort()
    m = abs(l[1] - l[0])
    for i in range(len(l) - 1):
        dis = l[i+1] - l[i]
        if dis < m:
            m = dis
    return m



n = int(input())

l = [int(input()) for _ in range(n)]

print(solve(l))