#python solution
import numpy as np
init_pos = (input().split(' '))
init_x = (int)(init_pos[0])
init_y = (int)(init_pos[1])
board = []
for i in range(3):
    row = input().split(' ')
    board.append(row)

isVisited = np.zeros(shape=(3,3))#keep track of whether the family is visited

def count(board, init_x, init_y):
    res = 0
    if init_x < 0 or init_x > 2 or init_y < 0 or init_y > 2:
        res = 0
    elif board[init_x][init_y] == '0':
        res = 0
    elif isVisited[init_x][init_y] == 1:
        res = 0         
    else:
        res = 1
        isVisited[init_x][init_y] = 1
        res += count(board, init_x+1, init_y)
        res += count(board, init_x-1, init_y)
        res += count(board, init_x, init_y-1)
        res += count(board, init_x, init_y+1)
    return res
    
    
print(count(board, init_x, init_y))