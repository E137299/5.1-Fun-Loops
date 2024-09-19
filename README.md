# 5.1-Fun-Loops

#### Overview
In this assignment, you will implement two mathematical methods: one to find and print the first `n` **Magic Squares** and another to calculate the **Least Common Multiple (LCM)** of two integers.

#### Background
1. **Magic Squares**:
   A **Magic Square** is a number that satisfies two conditions:
   - It is a perfect square.
   - It is the sum of consecutive integers starting from 1.

   For example:
   - **36** is a magic square because:
     - It is a perfect square (6 × 6 = 36).
     - It is the sum of the integers from 1 to 8 (1 + 2 + 3 + ... + 8 = 36).

   Another example is **1225**:
   - It is a perfect square (35 × 35 = 1225).
   - It is the sum of the integers from 1 to 49 (1 + 2 + 3 + ... + 49 = 1225).

2. **Least Common Multiple (LCM)**:
   The **LCM** of two integers is the smallest integer that is divisible by both numbers. For example:
   - The LCM of 2 and 3 is 6 (since 6 is the smallest number divisible by both 2 and 3).
   - The LCM of 12 and 15 is 60.

---

### Part 1: Magic Squares
Write a method that prints the first `n` magic squares. Start by finding the first **four magic squares**. The first one is the integer **1**.

#### Method Signature:
```java
public static void printMagicSquares(int n)
```

#### Example Output:
If `n = 4`, the output would be:
```
1
36
1225
41616
```

#### Instructions:
- Find the first 4 magic squares.
- Try finding the first 10 magic squares and measure how long the program takes to compute them.
- Experiment with this program by running it on computers with different clock speeds (megahertz).

---

### Part 2: Least Common Multiple (LCM)
Write a method that determines the **Least Common Multiple** of two integers.

#### Method Signature:
```java
public static int lcm(int a, int b)
```

#### Example LCM Calculations:
- **LCM of 2 and 3**: 6
- **LCM of 4 and 10**: 20
- **LCM of 12 and 15**: 60
- **LCM of 7 and 70**: 70

#### Input Pairs:
Find the LCM of the following pairs:
- 15 and 18
- 40 and 12
- 2 and 7
- 100 and 5

---

### Additional Challenge:
- Extend your program to find the first 10 magic squares. This will take significantly longer, so you can use this as an opportunity to measure the time it takes for the program to run on different computers.
- Experiment by running the program on machines with different clock speeds (in megahertz) to observe the differences in computation time.

