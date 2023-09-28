# Name: Secret Sum

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

Your intelligent friend has discovered a new message-passing protocol.
For a sender to share a large number, they print a series of single digit numbers in sequence. Before any 'useful' numbers, the sender says "psst".
The sum of the 'useful' numbers is the original message. 
Given a message from a sender, print the intended final message.

# Sample cases

Input:
```
1psst2
```

Output:
```
2
```

Input:
```
134psst523187psst21209875psst9019273
```

Output:
```
16
```

Explain: $5+2+9=16$

# Input

A single alphanumeric string

# Output

A single integer answer $A$

# Constraints
$A \leq 65536$

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String secretMessage = scanner.nextLine();
    }
}
```

# C++ Template
```
#include <iostream>
#include <string>

int main() {
    std::string secretMessage;
    std::cin >> secretMessage;

    return 0;
}
```

# Python Template
```
secret_message = input()
```