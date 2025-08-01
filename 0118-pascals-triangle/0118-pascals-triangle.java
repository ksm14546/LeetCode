class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}
