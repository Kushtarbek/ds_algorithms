/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9=15 . The right to left diagonal = 3+5+9+17 . Their absolute difference is 17-15=2 .
*/

function diagonalDifference(arr) {
    // Write your code here
const n = arr.length;
let primaryDiagonalSum = 0;
    let secondaryDiagonalSum = 0;
    for (let i = 0; i < n; i++) {
        primaryDiagonalSum += arr[i][i];
        secondaryDiagonalSum += arr[i][n - 1 - i];
    }
    return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
}
