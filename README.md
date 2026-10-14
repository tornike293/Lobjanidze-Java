# Algorithm Task (Java)

Requires JDK 11 or newer.

## Run

```
javac Main.java
java Main
```

The program asks for input in the console:
1. a number (prints `Hello` if it is greater than 7)
2. a name (prints `Hello, John` for "John", otherwise `There is no such name`)
3. an array of numbers separated by spaces (prints the elements that are multiples of 3)

It also checks the bracket sequence from part 2 with a stack.

Example run:

```
Enter a number: 10
Hello
Enter a name: John
Hello, John
Enter array numbers separated by spaces: 1 3 5 6 9 10 12
Multiples of 3: [3, 6, 9, 12]
Bracket sequence [((())()(())]] valid? false
Fixed sequence [((())()(()))] valid? true
```

## Part 2: Bracket sequence `[((())()(())]]`

**Can this sequence be considered correct?**
No. Reading left to right, after `[((())()(())` the stack still holds `[` and `(`. The first `]` then arrives while the top of the stack is `(`, so the pair does not match. In addition there are two `]` but only one `[`, so the second `]` has nothing to close.

**What needs to be changed?**
Replace the first `]` with `)`. The result is `[((())()(()))]`, where every bracket has a matching pair in the correct order.