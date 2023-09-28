# Name: Two Sub

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description
Given a target integer, $t$ and a list of $n$ unique integers, print the indices of the two integers in the list whose difference is $t$.

Each input has exactly one solution, every integer can only be used once, and the order of your output does matter -- print the indices in the order they would appear in the subtraction to obtain the target integer.

# Sample cases

Input:
```
4
3
3 7 4
```
Output:
```
1 0
```
Explain: The ouptut "1 0" is correct, because $7 - 3 = 4$. Note that "0 1" would be incorrect, because $3 - 7 = -4 \neq 4$.

Input:
```
14
5
3 -5 8 5 -9
```
Output:
```
3 4
```
Explain: The ouptut "3 5" is correct, because $5 - (-9) = 14$. Note that "5 3" would be incorrect, because $(-9) - 5 = -14 \neq 14$.

Input:
```
-117
4
58 -69 -3 48
```
Output:
```
1 3
```
Explain: The ouptut "1 3" is correct, because $-69 - 48 = -117$. Note that "3 1" would be incorrect, because $48 - (-69) = 117 \neq -117$.

# Input
A target integer $t$, followed by the length of the list $n$ in range $[1, 1000]$, followed by a list of $n$ integers each in range $[-1000000000, 1000000000]$.

# Output
The indices (zero indexed) of the two integers whoose difference is $t$.

# Constraints

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();
        int n = in.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
    }
}
```

# C++ Template
```

```

# Python Template
```
target = int(input())
n = int(input())
numbers = list(map(int, input().split()))
