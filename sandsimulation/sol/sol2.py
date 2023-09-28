
def solve(case:str):
    width, height, drop_index, count, target_x, target_y = map(int, case.split())

    board = [[0 for _ in range(width)] for _ in range(height)]

    totalCycles = 0

    worldHeight = height - 1 # testing somethin

    for _ in range(count):
        totalCycles += 1

        y, x = (worldHeight, drop_index)
        
        # drop loop
        while True:
            totalCycles += 1
            if y < height - 1: # bound check to see if you can go down
                if board[y + 1][x]: # is there anything below you?

                    if x < width - 1: # bound check for right wall
                        if not board[y + 1][x + 1]: # if you can move DR, move DR
                            y, x = y + 1, x + 1
                            continue
                    if x > 0: # bound check for left wall
                        if not board[y + 1][x - 1]:
                            y, x = y + 1, x - 1
                            continue

                    # if didn't move DR or DL, lock in place
                    break

                else: # if there isnt anything below, move down
                    y, x = y + 1, x
            elif y == height - 1: # have you reached the ground?
                # if so, just settle down
                break

        if y == worldHeight: worldHeight -= 1
        
        board[y][x] = 1


    print(f'Reached ({target_x}, {target_y})' if board[target_y][target_x] else f'Did not reach ({target_x}, {target_y})')
    # for y in board:
    #     print(*['.' if y[x] else ' ' for x in range(width)], sep = '', file = open('sandsimulation/temp.txt', 'w+'))
    #     # x = ['.' if y[x] else ' ' for x in range(width)]

    print(totalCycles)

if __name__ == "__main__":
    solve(input())
