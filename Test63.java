public class Test63 {

    public static void main(String[] args) {

        char[][] grid = {
                {'C','A','T'},
                {'D','O','G'},
                {'R','A','T'}
        };

        String word = "DOG";

        for (int i = 0; i < grid.length; i++) {

            String row = "";

            for (int j = 0; j < grid[i].length; j++) {
                row += grid[i][j];
            }

            if (row.contains(word)) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}