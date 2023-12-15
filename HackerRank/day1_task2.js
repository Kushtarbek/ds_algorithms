/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
four of the five integers. Then print the respective minimum and maximum values as a single line of two
space-separated long integers.
ex: arr = [1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints 16 24
*/

function miniMaxSum(arr) {
    let sortedArr = arr.sort((a,b) => a-b);
    let min = sortedArr.slice(0,4).reduce((acc, curVal) => acc + curVal, 0);
    let max = sortedArr.slice(1,5).reduce((acc, curVal) => acc + curVal, 0);

    console.log(min, max);
}
