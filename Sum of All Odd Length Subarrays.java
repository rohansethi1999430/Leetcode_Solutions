class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = 1;
        int s = arr.length;
        int sum = 0;
        while (n <= s) {
            for (int i = 0; i <= s - n; i++) {
                for (int j = i; j < i + n; j++)
                    sum = sum + arr[j];
            }

            n = n + 2;
        }

        return sum;
    }
}
