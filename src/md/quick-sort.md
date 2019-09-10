# Quick Sort

|case|time complexity|
|---|---|
|Worst|O(n^2)|
|Average case|O(n log n)|

## Step
arrays:
5, 9, 6, 2, 1, 4

1. pick a pivot, 4 (can be start, median or end from array)
2. go through array, swap element less than pivot to left, and store smaller number index
3. swap pivot to smaller number index + 1
4. quick sort left, 0 to pivot index - 1
5. quick sort right, pivot index + 1 to last index of array

after first attemp the array will be:
2, 1, 4, 5, 9, 6

6. quick sort left half 2, 1
7. quick sort right half 5, 9, 6
8. repeat the step until left pointer greater than equals right pointer