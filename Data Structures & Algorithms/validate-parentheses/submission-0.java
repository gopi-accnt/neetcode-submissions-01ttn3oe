class Solution {
    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        Map<Character, Character> hmOpenAndClose = new HashMap<>();
        hmOpenAndClose.put(']', '[');
        hmOpenAndClose.put('}', '{');
        hmOpenAndClose.put(')', '(');

        for (Character c : s.toCharArray()) {
            if (hmOpenAndClose.containsKey(c)) {
                if (!store.isEmpty() && store.peek() == hmOpenAndClose.get(c)) {
                    store.pop();
                } else {
                    return false;
                }
            } else {
                store.push(c);
            }
        }
        return store.isEmpty();
    }
}
