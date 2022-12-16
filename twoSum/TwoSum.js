<<<<<<< HEAD

=======
// Js comm

function twoSum(nums, target) {
    for(i=0;i<nums.length;i++){
        let differance= target-nums[i]
        for(x=0;x<nums.length;x++){
            if(differance===nums[x]){
                return [i,x]
            }    
        }
    }
}
twoSum([3,4,5,7],11)
>>>>>>> 890ab31ff5c91984b74dec629c266ac57d630e45

