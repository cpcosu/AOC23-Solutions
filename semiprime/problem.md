# Name: Semi Primes

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

A prime number is a natural number with exactly two distinct factors (i.e. 1 and the number itself).

Bartholomew defines a 'prime-once-removed' as a natural number with exactly two prime factors.
Bartholomew explains that the number 6 would be a prime-once-removed (since it factors into 2x3) but the number 12 would not (since it could factor into 6x2, and 6 is not prime).

Write a program to get an integer X from Bartholomew in the format "Bartholomew says {X}" and correctly print a reply "Bartholomew, {X} is a prime-once-removed" or "Bartholomew, {X} is NOT a prime-once-removed" depending on X.


# Sample cases

Input:
```
Bartholomew says 77
```

Output:
```
Bartholomew, 77 is a prime-once-removed
```

Input:
```
Bartholomew says 30
```

Output:
```
Bartholomew, 30 is NOT a prime-once-removed
```


# Input

A statement containing a positive integer $X$ of the format "Bartholomew says {X}".

# Output
If X is a prime-once-removed, 
"Bartholomew, {X} is a prime-once-removed".
Else, 
"Bartholomew, {X} is NOT a prime-once-removed"

<h2>Explanation</h2>
Example 1:<br>
77 can be expressed as 7*11.
Both 7 and 11 are prime, so 77 is a prime-once-removed.
<br><br>
Example 2:<br>
30 can be expressed as 3*10.
3 is prime but 10 is not prime, so 30 is NOT a prime-once-removed.

# Constraints

$X \leq 2147483648$

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String statement = scanner.nextLine();
    }
}
```

# C++ Template
```
#include <iostream>
#include <string>

int main() {
    std::string statement;
    std::cin >> statement;

    return 0;
}
```

# Python Template
```
statement = input()
```