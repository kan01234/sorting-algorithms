# Binary Insertion Sort
|case|time complexity|
|---|---|
|Worst|O(n log n)|
|Average case|O(n log n)|

## Step
similar with insertion sort but perform binary search when searching insert position.

And the searching time become O(log n) instead of O(n).

array:
[5, 9, 6, 2, 1, 4]

1. start at index 1
2. search the insert position with binary search
3. insert to postion and shift elements
3. repeat until pass through array

example:

number before "|" mean passed

1. [5, 9 | 6, 2, 1, 4]
2. [5, 6, 9 | 2, 1, 4]
3. [2, 5, 6, 9 | 1, 4]
4. [1, 2, 5, 6, 9 | 4]
5. [1, 2, 4, 5, 6, 9]

done
