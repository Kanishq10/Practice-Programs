import java.util.*;
class fa4 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,3,21,3,4,8,7,8,6,9,4,6,6,9,10,11,12,12,13,17,76,34,27,45,23,78,56};
        System.out.println((new SolutionX()).f(nums)); //it will return repeating elements
    }
}
class SolutionX{

    public List<Integer> f(int[] nums) {
            
            Set<Integer> set = new HashSet<Integer>();
            String temp = "";
            for(int i=0; i<nums.length; i++){
                if(temp.contains(""+nums[i])){
                    set.add(nums[i]);
                }
                temp+=nums[i];
            }
            List<Integer> res = new ArrayList<Integer>(set);
            return res;
        }
            
    }
