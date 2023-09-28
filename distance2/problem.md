# Name: Distance Part 2

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

Given N points on a number line, find the two closest points. Output the distance between them. This time, however, N can be much larger, and the points are not necessarily in ascending order.

# Sample cases

Input:
```
3
2
5
6
```

Output:
```
1
```

Input:
```
5
-10
0
9
5
-5
```

Output:
```
4
```


# Input

The first line contains the number of points N ($2 \leq N \leq 100,000$).
The next N lines each contain one number X ($-1,000,000 \leq X \leq 1,000,000$). None of the values of X are the same, but the input might be given in any order.

# Output
The distance between the two closest points.


# Constraints

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numPoints = scanner.nextInt();

        int[] points = new int[numPoints];

        for (int i = 0; i < numPoints; i++) {
            points[i] = scanner.nextInt();
        }
    }
}
```

# C++ Template
```

```

# Python Template
```
num_points = int(input())

points = []

for _ in range(num_points):
    points.append(int(input()))
```