
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        if(nums1.length>nums2.length)
        {
            for(int i = 0 ; i< nums2.length ; i++)
            {
                if(!list.contains(nums2[i]))
                {
                    if(Arrays.binarySearch(nums1, nums2[i])>=0)
                    {
                        list.add(nums2[i]);
                    }
                }
            }
        }
        else
        {
            for(int i = 0 ; i< nums1.length ; i++)
            {
                if(!list.contains(nums1[i]))
                {
                    if(Arrays.binarySearch(nums2, nums1[i])>=0)
                    {
                        list.add(nums1[i]);
                    }
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
