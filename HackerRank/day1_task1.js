/*Given an array of integers, calculate the ratios of its elements that are
positive, negative, and zero. Print the decimal value of each fraction on a
new line with 6 places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled
 to six decimal places, though answers with absolute error of up to  are acceptable.
 example: arr = [1,1,0,-1,-1]
 There are n=5 elements, two positive, two negative and one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5=0.200000. Results are printed as:
 0.400000
 0.400000
 0.200000
 */

function plusMinus(arr) {
    // Write your code here
 let positiveCount = 0;
    let negativeCount = 0;
    let zeroCount = 0;
    for ( let i = 0; i< arr.length; i++){
        if (arr[i] > 0) {
            positiveCount++;
        } else if (arr[i] < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
    }
    const totalNumbers = arr.length;
    const positiveRatio = (positiveCount / totalNumbers).toFixed(6);
    const negativeRatio = (negativeCount / totalNumbers).toFixed(6);
    const zeroRatio = (zeroCount / totalNumbers).toFixed(6);

    console.log(positiveRatio);
    console.log(negativeRatio);
    console.log(zeroRatio);
}