# Name: Introduction to Unix 2
#### Runtime Limit: 1.0s
#### Memory Limit: 500.00 MB

# Description
Ethan is a pro at creating files, but now wants to use vi for its intended purpose -- editing files. The input is similar to part one, but now the vi commands are followed by text denoting the new contents of the file. This is terminated by the vi exit-and-save command, ":wq". If vi is used on a file that already exists, its contents are overriden. Ethan also learned the "cat" command used for outputting the contents of a file. The sequence of commands will end with a single cat command (in the form "cat filename"). You should output the contents of that file.

# Sample cases

Input:
```
4
vi test.txt
hello, world!
:wq
cat test.txt
```

Output:
```
hello, world!
```

Input:
```
13
vi 1.txt
one
:wq
vi 2.txt
two
:wq
vi 2.txt
dos
:wq
vi 3.txt
three
:wq
cat 2.txt
```

Output:
```
dos
```

Input:
```
6
vi multiline.java
public static void main(String[] args) {
    System.out.println("Hello, world!");
}
:wq
cat multiline.java
```

Output:
```
public static void main(String[] args) {
    System.out.println("Hello, world!");
}
```

# Input

The number of lines of input $n$, followed by $n$ lines of input as described in the problem description.

# Output

The contents of the file that was "cat"ed.

# Constraints

$1 <= n <= 500$