# LeetCode Solutions - Day 01

This repository contains Java solutions to popular LeetCode problems with their problem descriptions, approaches, time complexity, space complexity, and examples.

---

## 📘 Problems Solved

| # | LeetCode | Problem | Topic | Approach | Time Complexity | Space Complexity |
|---|----------|---------|--------|----------|-----------------|------------------|
| 1 | 1 | Two Sum | Arrays | Brute Force (Nested Loops) | O(n²) | O(1) |
| 2 | 217 | Contains Duplicate | Arrays | Brute Force (Nested Loops) | O(n²) | O(1) |
| 3 | 268 | Missing Number | Arrays, Mathematics | Sum Formula | O(n) | O(1) |
| 4 | 283 | Move Zeroes | Arrays | Temporary Array | O(n) | O(n) |
| 5 | 26 | Remove Duplicates from Sorted Array | Arrays | Temporary Array | O(n²) | O(n) |

---

## 📌 Problem Descriptions

### 🔹 LeetCode 1 – Two Sum

Given an integer array `nums` and an integer `target`, return the indices of the two numbers whose sum equals the target.

**Approach**
- Use two nested loops.
- Compare every pair of elements.
- Return the indices when the target sum is found.

**Example**

**Input**
```text
nums = [2,7,11,15]
target = 9
```

**Output**
```text
[0,1]
```

---

### 🔹 LeetCode 217 – Contains Duplicate

Determine whether an array contains any duplicate values.

**Approach**
- Compare every element with the remaining elements.
- Return `true` if a duplicate is found.
- Otherwise return `false`.

**Example**

**Input**
```text
nums = [1,2,3,1]
```

**Output**
```text
true
```

---

### 🔹 LeetCode 268 – Missing Number

Find the missing number from an array containing numbers from `0` to `n`.

**Approach**
- Calculate the expected sum.
- Calculate the actual sum.
- Return the difference.

**Example**

**Input**
```text
nums = [3,0,1]
```

**Output**
```text
2
```

---

### 🔹 LeetCode 283 – Move Zeroes

Move all zeroes to the end while maintaining the relative order of non-zero elements.

**Approach**
- Store non-zero elements in a temporary array.
- Copy them back.
- Remaining positions become zero.

**Example**

**Input**
```text
nums = [0,1,0,3,12]
```

**Output**
```text
[1,3,12,0,0]
```

---

### 🔹 LeetCode 26 – Remove Duplicates from Sorted Array

Remove duplicate elements from a sorted array.

**Approach**
- Store unique elements in a temporary array.
- Copy them back.
- Return the number of unique elements.

**Example**

**Input**
```text
nums = [0,0,1,1,1,2,2]
```

**Output**
```text
k = 3
nums = [0,1,2]
```

---

## 💻 Technologies Used

- Java
- VS Code
- LeetCode
