class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
                // System.out.println(num);
                steps++;
            } else {
                num = num - 1;
                // System.out.println(num);
                steps++;
                if (num > 0) {
                    num = num / 2;
                    // System.out.println(num);
                    steps++;
                }
            }

        }
        return steps;
    }
}