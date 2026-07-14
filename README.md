# Leetcode-Solutions

This repository contains my Java solutions to popular LeetCode problems along with their approaches, time complexity, space complexity, and sample examples.

## Problems

- Two Sum
- Contains Duplicate
- Missing Number
- Move Zeroes
- Remove Duplicates from Sorted Array

---

# 1. Two Sum - Java

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

### Approach

- Use two nested loops.
- Compare every pair of elements.
- If the sum of two elements equals the target, return their indices.

### Time Complexity

- **O(n²)**

### Space Complexity

- **O(1)**

### Example

**Input**
```
nums = [2,7,11,15]
target = 9
```

**Output**
```
[0,1]
```

---

# 2. Contains Duplicate - Java

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array; otherwise, return `false`.

### Approach

- Compare every element with the remaining elements using nested loops.
- If two elements are equal, return `true`.
- If no duplicates are found, return `false`.

### Time Complexity

- **O(n²)**

### Space Complexity

- **O(1)**

### Example

**Input**
```
nums = [1,2,3,1]
```

**Output**
```
true
```

---

# 3. Missing Number - Java

## Problem Statement

Given an array containing `n` distinct numbers in the range `[0, n]`, return the missing number.

### Approach

- Calculate the expected sum of numbers from `0` to `n`.
- Calculate the actual sum of all array elements.
- The missing number is the difference between the expected sum and the actual sum.

### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**

### Example

**Input**
```
nums = [3,0,1]
```

**Output**
```
2
```

---

# 4. Move Zeroes - Java

## Problem Statement

Given an integer array, move all `0`s to the end while maintaining the relative order of the non-zero elements.

### Approach

- Create a temporary array.
- Copy all non-zero elements into the temporary array.
- Copy the temporary array back to the original array.
- Remaining positions automatically contain `0`.

### Time Complexity

- **O(n)**

### Space Complexity

- **O(n)**

### Example

**Input**
```
nums = [0,1,0,3,12]
```

**Output**
```
[1,3,12,0,0]
```

---

# 5. Remove Duplicates from Sorted Array - Java

## Problem Statement

Given a sorted array, remove duplicate elements so that each unique element appears only once. Return the number of unique elements.

### Approach

- Create a temporary array.
- Traverse the original array.
- For each element, check whether it already exists in the temporary array.
- If it is not a duplicate, store it in the temporary array.
- Copy the unique elements back to the original array.

### Time Complexity

- **O(n²)**

### Space Complexity

- **O(n)**

### Example

**Input**
```
nums = [0,0,1,1,1,2,2]
```

**Output**
```
k = 3
nums = [0,1,2]
```
