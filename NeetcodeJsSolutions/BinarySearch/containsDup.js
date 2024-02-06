/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {

    //T: O(N) S: O(N)
    //Set comparison
    //   const set = new Set(nums);
    //   return set.size !== nums.length;

    //T: O(N) S: O(N)
    //Object  solution
    //   let newObj = {};
    //     for (let i = 0; i < nums.length; i++) {
    //         let num = nums[i];
    //         if(newObj[num]){
    //             return true;
    //         }else{
    //             newObj[num] = true;
    //         }
    //     }
    //     return false;
    // };

    //*the best solution as long as there are duplicates.
    const containsDuplicate = (nums, numsSet = new Set()) => {
        for (const num of nums) {
            if (numsSet.has(num)) return true;
            numsSet.add(num);
        }
        return false;
    }

//Map solution
// var containsDuplicate = function(nums) {
//       let seen = new Map();
//     for(const num in nums) {
//         if (seen.has(nums[num])) return true
//         seen.set(nums[num])
//     }
//   return false;
// };
