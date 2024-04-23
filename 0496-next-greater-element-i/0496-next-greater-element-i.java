class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n = nums2.length;
        Stack < Integer > st = new Stack < > ();
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            int element=nums2[i];
            while (st.isEmpty() == false && st.peek() <= element) {
                st.pop();
            }
            if (st.isEmpty()) 
            map.put(element,-1);
            else
            map.put(element,st.peek());
            
            st.push(element);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;;
        }
        return nums1;

    }
}