# Binary Search Summary

- An algorithm that uses 'arrays'
- Logarithmic runtime O(log n)
- It becomes faster as the list size increases

# Big O Notation Summary

- A special notation that describes how fast an algorithm is (runtime)
- An algorithm's speed is not measured in seconds, but by the growth in the number of operations

## Examples

- O(log n): Binary search
- O(n): Linear time (simple search)
- O(n * log n): Fast sorting algorithm (quicksort)
- O(n^2): Slow sorting algorithm (selection sort)
- O(n!): Traveling salesman

## Traveling Salesman

The Opus traveling salesman needs to visit five cities. But he wants to visit all cities while minimizing the distance. To do this, we need to analyze every possible order of cities to visit and sum all the distances.

| Cities | Operations |
|--------|:----------:|
| 6      | 720        |
| 7      | 5040       |
| 8      | 40320      |
| ...    | ...        |
| 15     | 1307674368000 |

The number of operations increases dramatically.
