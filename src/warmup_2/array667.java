package warmup_2;

public class array667 {
	public int array667(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==6&&nums[i]==nums[i+1]) {
				count++;
			}else if(nums[i]==6&&nums[i+1]==7) {
				count++;
			}
		}
		return count;
	}
}
