# Name: Introduction to Unix
#### Runtime Limit: 1.0s
#### Memory Limit: 500.00 MB

# Description
Ethan is doing summer research under UNIX environment. However, he is not comfortable with basic UNIX commands. In this quick tutorial, Ethan is learning a single command, vi. vi takes a single string as an argument, the file name to be edited. If the file does not exist, vi will create a new file with that name; if the file already exists, vi will edit it. Your job is to figure out the number of unique files created by Ethan given $n$ vi commands.

# Sample cases

Input:
```
3
vi test.txt
vi test2.txt
vi test.txt
```

Output:
```
2
```

Input:
```
5
vi 1.txt
vi 2.txt
vi 2.txt
vi 4.txt
vi 4.txt
```

Output:
```
3
```

# Input

The number of commands $n$, followed by $n$ vi commands. Each line contains the word "vi" followed by a space and a string of characters. The string will not contain any spaces. (i.e., the command "vi a.txt b.txt" is not a valid input).

# Output

The number of unique files created by Ethan.

# Constraints

$1 <= n <= 100$