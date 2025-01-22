# Sorting Algorithms Summary

## Quick Sort
- **Description**: A fast, divide-and-conquer sorting algorithm.
- **Key Features**:
    - Selects a "pivot" element.
    - Partitions the array into two sub-arrays:
        - Elements smaller than the pivot.
        - Elements larger than the pivot.
    - Recursively sorts the sub-arrays.
- **Big O Notation**:
    - Best case: **O(n * log n)**
    - Worst case: **O(n^2)** (when the pivot is poorly chosen, e.g., smallest or largest element repeatedly).
    - Average case: **O(n * log n)**.
- **Advantages**:
    - Faster than many other algorithms (like selection sort) for large datasets.
- **Disadvantages**:
    - Not stable (elements with the same value might change order).

---

## Selection Sort
- **Description**: A simple sorting algorithm.
- **Key Features**:
    - Repeatedly selects the smallest (or largest) element from the unsorted part of the array.
    - Swaps it with the first element in the unsorted part.
    - Moves the boundary between sorted and unsorted parts.
- **Big O Notation**:
    - Best case: **O(n^2)**.
    - Worst case: **O(n^2)**.
    - Average case: **O(n^2)**.
- **Advantages**:
    - Easy to implement.
    - Requires minimal memory (in-place).
- **Disadvantages**:
    - Inefficient for large datasets.
    - Always performs \( n^2/2 \) comparisons, even if the array is already sorted.
