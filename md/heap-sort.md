# Heap Sort

|case|time complexity|
|---|---|
|Worst|O(n log n)|
|Average case|O(n log n)|

## Step
array:
[5, 9, 6, 2, 1, 4]

1. build the heap

                5
            /       \
        9               6
    /       \       /
2           1       4

2. build max heap, mean parent node is great than or equal child node
                9
            /       \
        5               6
    /       \         /
2              1     4 

and the array will be:

[9, 5, 6, 2, 1, 4]

3. swap first, last element

4. remove last element from heap

5. repeat step 2 - 4 until only one element left in heap