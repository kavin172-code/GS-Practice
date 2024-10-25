import java.util.ArrayList;
import java.util.List;

public class Question29 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

            for (int row = 0; row < numRows; row++) {
                List<Integer> currentRow = new ArrayList<>();
                for (int col = 0; col <= row; col++) {
                    if (col == 0 || col == row) {
                        currentRow.add(1);
                    } else {

                        int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                        currentRow.add(value);
                    }
                }
                triangle.add(currentRow);
            }

            return triangle;

    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascalTriangle = generate(numRows);

        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
