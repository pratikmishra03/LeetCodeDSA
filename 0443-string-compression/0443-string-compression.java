class Solution {
    public int compress(char[] chars) {
        int n = chars.length ; 
        int index = 0;
        int i = 0;     
        while (i < n) {
            char curr_char = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr_char) {
                count++;
                i++;
            }
            chars[index] = curr_char;
            index++;
            if (count > 1) {
                String cnt_str = String.valueOf(count);
                for (int j = 0; j < cnt_str.length(); j++) {
                    chars[index] = cnt_str.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }  
}
