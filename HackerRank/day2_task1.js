/*
Given an array of integers, where all elements but one occur twice, find the unique element.

arr = [1,2,3,4,3,2,1]; unique is 4;*/

function lonelyInteger(a) {
    let res = 0;
    for(let i =0; i<a.length; i++){
       res ^= a[i];
    }
    return res;
}
