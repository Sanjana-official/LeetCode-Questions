class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] arr = binary.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) 
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);
        int decimal = 0;
        int power = 0;

        for (int i = reversed.length() - 1; i >= 0; i--) 
        {
            if (reversed.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
