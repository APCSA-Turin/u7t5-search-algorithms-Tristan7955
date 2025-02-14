package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] arr, int target) {
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int loopCount = 0;

        while (leftIdx <= rightIdx) {
            loopCount++;
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;

            if (arr[midIdx] == target) {
                System.out.println("Loop iterations: " + loopCount);
                return midIdx;
            } else if (arr[midIdx] < target) {
                leftIdx = midIdx + 1;
            } else {
                rightIdx = midIdx - 1;
            }
        }

        System.out.println("Loop iterations: " + loopCount);
        return -1;
    }
}
