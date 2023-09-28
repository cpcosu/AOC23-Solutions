# Name: Spread Rumors 2

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description
Part 1: <https://buckeyecode.club/problem/view/spreadrumors.html>

People are continuing to spread rumors! 
This time, more people have joined the grid to spread rumors better than ever. They've formed a square grid, to maximize efficiency in reaching everyone.
Given a pair of rumor starting coordinates (M,N), the side length of the people-square S, and a S*S square arrangement of people, can you tell how many people end up knowing the rumor once it's finished spreading?
Remember, only people who love starting/sharing rumors ('1') can spread the rumor; people who dislike them ('0') do not participate in such frivolous activities.

# Sample cases

Input:

```
1 1
3
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
1 3
6
1 1 0 1 1 0
1 0 1 1 0 0
1 1 1 0 0 0
0 1 0 0 1 0
0 1 0 1 1 0
0 0 0 1 1 0
```

Output:

```
12
```



# Input

A pair of starting coordinates of the rumor $m$ and $n$ (0-indexed), the dimensions of the grid $x$ and $y$, followed by an $X$*$Y$ matrix of integers in {0,1} that represent whether each person loves rumors or not: 
"1" means that this person could start/share  rumors; "0" means this person dislikes rumors.  
Note: The coordinates start at the top left corner of the matrix; x=0,y=0 refers to 0th column, 0th row.
# Output

The number of people (including the person that starts the rumor) that know the rumor when it is done spreading.

# Constraints
