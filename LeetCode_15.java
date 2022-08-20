/*
 3sum
 space: O(n)
 runtime : O(n)
*/

public List<List<Integer>> threeSum(int[] nums) {
   //result 
  Set<List<Integer>> res = new HashSet<>();
  //set that trigers all each iteration
  Set<Integer> dups = new HashSet<>();
 //where we'll store all the elements we've visited to avoid visiting them twice
  Map<Integer, Integer> seen = new HashMap<>();
    for (int i = 0; i < nums.length; ++i)
         //if we're adding a value to dups
            if (dups.add(nums[i])) {
             // check if it has a compliment that adds up to a value that already in the seen HashMap
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                   //if the seen has the compliment create a temp list add the nums[j],nums[j], and the compliment 
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                     //sort the temp list and add it to our final result set 
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                 //if the compliment is not in seen add the nums[j], i to the collections so we don't have to visit it again 
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res); 
   }
