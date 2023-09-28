


def solve(l):
    m = abs(l[1] - l[0])
    for a in range(len(l)):
        for b in range(len(l)):
            if a != b:
                dis = abs(l[a] - l[b])
                if dis < m:
                    m = dis
    return m



n = int(input())

l = [int(input()) for _ in range(n)]

print(solve(l))