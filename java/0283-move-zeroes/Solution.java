class Solution 
{
    public void swap(int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums)
     {
        int i=0;
        int j=0;
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                  swap(nums,i,j);
                  i++;
            }
        }
    }
}