class Solution {
    public int calPoints(String[] ops) {
        // Deque<Integer>d=new ArrayDeque<>();
        Stack<Integer> d = new Stack();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                if (!d.isEmpty()) {
                    d.pop();
                }
            } else if (ops[i].equals("D")) {
                int j = d.peek() * 2;
                d.push(j);
            }

            else if (ops[i].equals("+")) {
                int s = d.size();
                int sum = d.get(s - 1) + d.get(s - 2);
                d.push(sum);
            } else {
                int v = Integer.valueOf(ops[i]);
                d.push(v);
            }

        }
        int l = 0;
        for (int k = 0; k < d.size(); k++) {
            l = d.get(k) + l;

        }

        return l;

    }
}