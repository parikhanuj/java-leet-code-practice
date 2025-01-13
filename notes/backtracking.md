# Backtracking




## Keys
- Choices
- Constraints
- Goal

## Recipe
```java
backtrack(res, args)
    if (goal reached)
        add solution to res
        return
    for (i = 0; i < no_of_choices; i++) 
        if (choices[i] is valid)
            make choices[i]
            backtrack(res, args)
            undo choices[i] 
```