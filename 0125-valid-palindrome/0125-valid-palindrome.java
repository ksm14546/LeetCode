class Solution {
    public boolean isPalindrome(String s) {
        String orig = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder res = new StringBuilder(orig).reverse();
        return orig.equals(res.toString());
    }
}