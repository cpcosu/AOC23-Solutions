# Name: Case Counter

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

Given 2 integers X and Y and a string S, return the first X uppercase letters and first Y lowercase letters in S.
Code Golf rules -- working solution that uses *the fewest characters* wins!

# Sample cases

Input:
```
3 3
ABCDefgh
```

Output:
```
ABC
efg

```

Input:
```
4 3
aBCdEFgHIJkl
```

Output:
```
BCEF
adg
```

# Input

Two integers X and Y separated by a single space
A sequence of alphanumeric characters on the following line

# Output
Two lines of letters -- 
the X uppercase letters and the first Y lowercase letters, in the order in which they occured in the original string.

# Constraints

|S| >= X+Y, 
There is guaranteed to be |uppercase alphabets| >= X & |lowercase alphabets| >= Y 
