import java.util.Arrays;   
class SolutionArr {
    static int max(int a,int b) {
        return a<b ? b : a;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
for(int i=0;i<nums.length;i++)
System.out.println(nums[i]);
        return max((nums[1]-nums[0]),(nums[3]-nums[2]));
    }
}