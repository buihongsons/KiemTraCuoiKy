import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _442_Find_All_Duplicates_in_an_Array {
    class Solution {
        public List<Integer> findDuplicates(int[] nums)
        {
            HashSet<Integer> knownElements = new HashSet();
            List<Integer> alld = new ArrayList();
            for(int i = 0; i < nums.length; i++)
            {
                if(!knownElements.contains(nums[i]))
                {
                    knownElements.add(nums[i]);
                }
                else
                {
                    alld.add(nums[i]);
                }
            }
            return(alld);
        }
    }
}
