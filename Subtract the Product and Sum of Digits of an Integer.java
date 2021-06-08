class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int rem = 0;
        while (n >= 10) {
            rem = n % 10;
            // System.out.println(rem);
            n = n / 10;
            sum = sum + rem;
            product = product * rem;
        }
        sum = sum + n;
        product = product * n;
        return product - sum;

    }
}