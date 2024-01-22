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



reverseString("hello");
