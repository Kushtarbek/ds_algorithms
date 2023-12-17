/*
Given an array of n distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first & elements in the sequence are in
increasing order and the last k elements are in decreasing order, where k = (n + 1)/2. You need to
find the lexicographically smallest zig zag sequence of the given array.
Example.
a = 2, 3, 5, 1, 4)
Now if we permute the array as 1, 4, 5, 3, 2, the result is a zig zag sequence.
*/


function lexicographicallySmallestZigzag(arr) {
    const n = arr.length;

    // Custom sorting function
    const customSort = (a, b) => {
        if (a < b) return -1;
        if (a > b) return 1;
        return 0;
    };

    // Step 1: Sort the array using the custom sorting function
    const sortedArr = arr.slice().sort(customSort);

    // Step 2: Divide into two halves
    const firstHalf = sortedArr.slice(0, Math.floor(n / 2));
    const secondHalf = sortedArr.slice(Math.floor(n / 2)).reverse();

    // Step 3: Interleave the elements
    const result = [];
    for (let i = 0; i < Math.floor(n / 2); i++) {
        result.push(firstHalf[i]);
        result.push(secondHalf[i]);
    }

    // Handle the middle element if n is odd
    if (n % 2 !== 0) {
        result.push(sortedArr[Math.floor(n / 2)]);
    }

    return result;
}

// Example usage:
const inputArray = [1, 2, 3, 4, 5, 6, 7];
const result = lexicographicallySmallestZigzag(inputArray);

console.log("Lexicographically Smallest Zigzag Sequence:", result);
