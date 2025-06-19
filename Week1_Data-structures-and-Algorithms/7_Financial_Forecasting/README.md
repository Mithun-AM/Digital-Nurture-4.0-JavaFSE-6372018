# Financial Forecasting - Recursive Approach

This tool calculates the future value of an investment using recursive algorithms based on past growth rates.

---

## Concept of Recursion

Recursion is a programming technique where a function calls itself to solve smaller subproblems.

### Benefits:
- Simplifies complex problems like tree traversal, backtracking, or repeated calculations.
- Mirrors mathematical definitions (e.g., factorial, Fibonacci, power).

### Example:
```java
FutureValue(n) = FutureValue(n - 1) * (1 + rate)
