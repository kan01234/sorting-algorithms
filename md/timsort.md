# Timsort

|case|time complexity|
|---|---|
|Worst|O(n log n)|
|Average case|O(n log n)|
|Best case|O(n)|

## terms

- runs
    - sub array of array, in ascending or strictly descending order

- min run size
    - if array size is less than min run size, will sort by binary insertion sort or insertion sort

- merging
    - merge runs
    - prefer to perfom balance merge

- galloping mode
    - when merging two runs, let say runs1 and runs2
    - runs1 have X elements is less than runs2, it over min galloping count
    - continus to compare until runs1 elements is greater than runs2
    - copy the less elements from runs1

## Step
arrays:
[5, 9, 6, 2, 1, 4]

assume min run size is 3

1. build runs
    [5, 6, 9], [1, 2, 4]

2. merging
    [1, 2, 4, 5, 6, 9]