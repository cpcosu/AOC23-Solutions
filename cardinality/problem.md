# Name: Set of Sets

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

(insert MATH 3345 reference)
The cardinality of a set is how many elements it contains. Given a set containing other sets, determine its cardinality.

# Sample cases

Input:
```
{{}, {}, {}}
```

Output:
```
3
```

Input:
```
{{}, {{}, {}}, {{}, {}, {}}, {{{}}}}
```

Output:
```
4
```

# Input

The string representation of a set S, containing only curly braces, commas, and spaces. You should ignore all spaces.

# Output

|S|

# Constraints

The string representation of S will be fewer than 1000 characters.

$|S| \geq 1$

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String set = scanner.nextLine();
    }
}
```

# C++ Template
```
#include <iostream>
#include <string>

int main() {
    std::string set;
    std::cin >> set;

    return 0;
}
```

# Python Template
```
input_set = input()
```