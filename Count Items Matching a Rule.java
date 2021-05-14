class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        }
        if (ruleKey.equals("color")) {
            index = 1;
        }
        if (ruleKey.equals("name")) {
            index = 2;
        }
        for (List<String> list : items) {

            String value = list.get(index);

            if (value.equals(ruleValue)) {
                count++;
            }

        }
        return count;
    }
}