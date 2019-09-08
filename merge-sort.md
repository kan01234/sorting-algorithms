# Merge Sort

|case|time complexity|space complexity|
|---|---|
|Worst|O(n log n)|O(n)
|Average case|O(n log n)|O(n)

## Step
array:
[5, 9, 6, 2, 1, 4]

1. divide array into two halves:
    [5, 9, 6, 2, 1, 4] will be

2. repeat until unable to divide
    [5, 9, 6], [2, 1, 4]
    [5, 9] | [6]

3. merge when unable to divide
    [5] | [9]
    [5, 9] | [6]

4. left half is complete, repeat it on right
    and the array will be:
    [5, 6, 9, 2, 1, 4]

    