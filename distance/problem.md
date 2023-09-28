# Name: Distance

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

Given N points on a number line, find the two closest points. Output the distance between them.

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
-5
0
5
9
```

Output:
```
4
```


# Input

The first line contains the number of points N ($2 \leq N \leq 10$).
The next N lines each contain one number X ($-100 \leq X \leq 100$). None of the values of X are the same, and the input will be given in ascending order.

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