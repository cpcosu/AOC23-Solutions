# Name: Spread Rumors

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description
Some people love telling and spreading rumors, other people don't enjoy them as much.
Consider one particular rumor told by someone in a 3x3 grid of people.
We know that people will NOT spread rumors diagonally (people only tell rumors to neighbors above/below/left/right of themselves). 
The rumor will also only spread to/from people who love rumors (marked '1' in the grid); other people who do NOT like rumors (marked '0') are guaranteed not to create/spread rumors at all. 
Given the coordinates of the starting position of the rumor, and the inclinations of the 9 people in the grid (to spread the rumor), can we tell the final total # of people that know the rumor?

# Sample cases

Input:

```
1 1
0 0 0
1 1 0 
1 0 1
```

Output:

```
3
```

Input:

```
0 0
1 1 0
0 1 1 
1 0 1
```

Output:

```
5
```

# Input

A pair of coordinates of the original rumor $m$ and $n$ (0-indexed), followed by 3x3 matrix of integers in {0,1} that represent whether each person loves rumors or not: 
"1" means that this person could start/share  rumors; "0" means this person dislikes rumors.  
 
# Output

The number of people (including the person that starts the rumor) that know the rumor when it cannot spread any further.

<h2>Explanation</h2>
Example 1:<br>
The rumor starts at coordinates (1,1) -- 2nd row, 2nd column [0-indexed]-- the middle person in the grid.
Since people only share rumors with neighbors who are '1's above/below/left/right of them, the rumor next spreads to the person at (1,0) -- 2nd row, 1st column.
The rumor then finally spreads to the person at (0,2), which results in a total of 3 people knowing the rumor.
<br><br>
Example 2:<br>
The rumor starts at coordinates (0,0) -- 1st row, 1st column [0-indexed] -- the top left person in the grid.
Since people only share rumors with '1's above/below/left/right of them, the rumor next spreads to the person at (0,1) -- 1st row, 2nd column (top middle in the grid).
The rumor then proceeds to spread to people at (1,1), (1,2), and finally (2,2), which results in a total of 5 people knowing the rumor.

# Constraints
