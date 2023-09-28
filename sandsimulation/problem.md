# Name: Sand Simulation

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

You are given a 2D grid to simulate sand on. You will be given a width and height of the grid. You will also be given the index to drop sand and the amount of sand dropped from that location. The rules for the sand goes as follows: 
<br>
- If their is nothing below the sand move down. <br>
- Else if their is nothing diagonally down and right from the sand move down and right.<br>
- Else if their is nothing diagonally down and left from the sand move down and left. 

# Sample cases

Input:
```
5 3 3 6
```

Output:
```
     
   ..
 ....
```


# Input

Width, height, drop position (0 indexed), and number of sand particles dropped.
Max width, height and number of particles dropped is 100. The drop position will be within the width of the grid.  

# Output

The final grid of sand particles. With '.' representing sand and ' ' representing no sand. 

_# Constraints



