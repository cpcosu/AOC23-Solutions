# Name: Power Rule

#### Runtime Limit: 1.0s

#### Memory Limit: 500.00 MB

# Description

Given a polynomial $p$ and an integer $k$, output the $k$-th derivative of $p$.

The derivative of a monomial is calculating using a rule called the "power rule":

$$
\frac{d}{dx} x^n = nx^{n-1}
$$

For a polynomial, apply this rule to every term. This is repeated multiple times for higher derivatives.

For example, consider the second derivative of the polynomial `5x^3 + x^2 + x`.

For the first derivative, apply the power rule to each term: `10x^2 + 2x + 1`. Notice that the first power (`^1`) is omitted and the the zero-th power (`x^0`) is just one.

Now take the second derivative: `20x + 2`. Here, the derivative of `1` (a constant) is zero, so it is also omitted.

# Sample cases

Input:
```
x^2
1
```

Output:
```
2x
```

Input:
```
5x^5 + 2x^3 + x + 1
2
```

Output:
```
100x^3 + 12x
```

Input:
```
x^9
10
```

Output:
```
0
```

# Input

A string representation of the degree-$n$ polynomial $p$. The polynomial will always be represented in decreasing powers (e.g., $x^2 + x$ instead of $x + x^2$) and separated only by addition. Then, an integer $k$.

# Output

A string representation of the $k$-th derivative of $p$.

# Constraints

$$
1 \leq n \leq 9
$$

$$
1 \leq k \leq 10
$$

Each coefficient will lie between $1$ and $100$.

# Java Template
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String expression = scanner.nextLine();
    }
}
```

# C++ Template
```
#include <iostream>
#include <string>

int main() {
    std::string expression;
    std::cin >> expression;

    return 0;
}
```

# Python Template
```
input_expression = input()
```