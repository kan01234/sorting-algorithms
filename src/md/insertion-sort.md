# Insertion Sort
|case|time complexity|
|---|---|
|Worst|O(n ^ 2)|
|Average case|O(n ^ 2)|

## Step
array:
[5, 9, 6, 2, 1, 4]

1. start at index 1
2. pass through array to find insert postion
3. insert to postion and shift elements
4. repeat until pass through array

example:

number before "|" mean passed

1. [5, 9 | 6, 2, 1, 4]
2. [5, 6, 9 | 2, 1, 4]
3. [2, 5, 6, 9 | 1, 4]
4. [1, 2, 5, 6, 9 | 4]
5. [1, 2, 4, 5, 6, 9]

done
