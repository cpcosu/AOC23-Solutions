def infect(grid, x, y):
    if x-1 >= 0 and grid[x-1][y] == 1:
        grid[x-1][y] = 2
        next.add((x-1, y))
    if y-1 >= 0 and grid[x][y-1] == 1:
        grid[x][y-1] = 2
        next.add((x, y-1))
    
    if x+1 < size and grid[x+1][y] == 1:
        grid[x+1][y] = 2
        next.add((x+1, y))
    if y+1 < size and grid[x][y+1] == 1:
        grid[x][y+1] = 2
        next.add((x, y+1))

m, n = map(int, input().split())
size = int(input())
grid = [[int(c) for c in input().split()] for i in range(size)]
check = set()
if grid[m][n] == 1:
    grid[m][n] = 2
    check.add((m, n))

while len(check) != 0:
    next = set()
    for (i, j) in check:
        infect(grid, i, j)
    check = next


sum = 0
for i in range(size):
    for j in range(size):
        if grid[i][j] == 2:
            sum += 1
print(sum)