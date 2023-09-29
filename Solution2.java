class Solution2 {
    public static int removeDuplicates(int[] nums) {
        int left=0,right=0;
        for(int i=1;i<nums.length;i++)
        {
        	if(nums[i]==nums[left])
		{
			right++;
		}
		else if(nums[i]!=nums[left])
		{
			left++;
			right++;
			if(left != right)
			{
				int tmp = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp;
			}
		}
        }
        return left;
    }

public static void main(String [] args)
{
int arr1 [] = {1,1,2};
int k = removeDuplicates(arr1);
for(int j=0;j<arr1.length;j++)
	System.out.println(arr1[j]);
}
}
