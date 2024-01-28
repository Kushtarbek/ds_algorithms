//reverse a string

//1
function reverseString(str) {
  return str.split('').reverse().join('');
}

//2
function reverseString(str){
    var newStr = '';
    for( let i =str.length-1; i >= 0; i--){
        newStr += str[i];
    }
    return newStr;
}

//3 recursion
function reverseString(str){
    if( str === ''){
        return '';
    }
    else{
        return reverseString(str.substr(1)) + str.charAt(0);
    }
}

reverseString("hello");
//----------


function convertToFahrenheit(celsius){
    return celsius * 9/5 +32;
}
//---------

function factorialize(num) {
  if(num < 0) return -1;
  else if( num === 0) return 1;
  else return (num * factorialize(num-1));
  return num ;
}

function factorialize(num) {
    if(num === 0 || num === 1) return 1;
    for(let i=num-1; i>=1; i--){
        num *= i;
    }
    return num;
}
factorialize(5);

//----------------
function findLongestWordLength(str) {
  let longest = 0;
  let arr = str.split(' ');
  for( let i=0; i<arr.length; i++){
    if(arr[i].length > longest){
      longest = arr[i].length;
    }
  }
  return longest;
}

function findLongestWordLength(str) {
    str.split(' ').sort(function(a,b) { b.length - a.length});
     return longestWord[0].length;
}

//-------

function titleCase(str) {
  const newTitle = str.split(" ");
  const updatedTitle = [];
  for( let str in newTitle){
    updatedTitle[str] = newTitle[str][0].toUpperCase() +
    newTitle[str].slice(1).toLowerCase();
  }
  return updatedTitle.join(" ");
}
titleCase("I'm a little tea pot");

//-------

function frankenSplice(arr1, arr2, n) {
  let resArr = arr2.slice();
  for( let i=0; i<arr1.length; i++){
      resArr.splice(n, 0, arr1[i]);
      n++;
  }
  return resArr;
}

frankenSplice([1, 2, 3], [4, 5, 6], 1);
//------
function bouncer(arr) {
  let newArr = []
   for(let i =0; i< arr.length; i++){
     if(arr[i]){
       newArr.push(arr[i])
     }
   }
  return newArr;
  //return arr.filter(Boolean);
}

bouncer([7, "ate", "", false, 9]);
