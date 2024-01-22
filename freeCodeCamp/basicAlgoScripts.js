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
