/*LC_2727
//Given an object or an array, return if it is empty.
//
//An empty object contains no key-value pairs.
//An empty array contains no elements.
//You may assume the object or array is the output of JSON.parse.
*/

//approach1
var isEmpty = function(obj) {
    if (JSON.stringify(obj).length <= 2) return true
    else return false
};

//approach2
var isEmpty = function(obj) {
   return Object.keys(obj).length === 0
};
