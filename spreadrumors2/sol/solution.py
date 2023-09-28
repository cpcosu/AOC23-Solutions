#python solution
import numpy as np
def count(board, init_x, init_y, rows, cols):
    coords=[(init_x, init_y)]
    count=0
    while len(coords)>0:
        (x,y)=coords.pop()
        if x<0 or x>=rows or y<0 or y>=cols or board[x][y]=='0' or isVisited[x][y]==1:
            pass
        else:
            count+= 1
            isVisited[x][y] = 1
            coords.append((x+1,y))
            coords.append((x-1,y))
            coords.append((x,y+1))
            coords.append((x,y-1))
    return count

def solve(board, init_x, init_y, rows, cols):
    isVisited = np.zeros(shape=(rows, cols))
    return count(board, init_x, init_y, rows, cols)

if __name__=='__main__':
    init_x,init_y=map(int, input().split())
    rows=int(input())
    board = []
    for i in range(rows):
        board.append(input().split(' '))
    isVisited = np.zeros(shape=(rows, rows))    #keep track of whether the person has been visited
    print(count(board, init_x, init_y, rows, rows))