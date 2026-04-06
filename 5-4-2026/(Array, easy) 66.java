import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for (int n : digits) {
            sb.append(n);
        }

        // Use BigInteger instead of int
        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        String str = num.toString();
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        return arr;
    }
}
