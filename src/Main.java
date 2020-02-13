public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int [][] boardToSolve = {
                {7,0,0,4,0,2,0,0,5},
                {9,5,8,6,0,0,4,0,1},
                {4,2,3,9,1,0,7,6,8},
                {5,0,2,0,4,0,6,1,3},
                {0,0,9,3,0,6,0,7,0},
                {0,0,0,1,5,0,0,0,0},
                {0,0,0,0,0,1,3,0,0},
                {3,9,5,0,6,8,1,4,7},
                {0,8,0,7,0,0,2,0,9},
        };

        System.out.println("Initial board entered: ");
        sudoku.printBoard(boardToSolve);
        sudoku.solveBoard(boardToSolve);
        System.out.println("\nSolved Sudoku Board:\n ");
        sudoku.printBoard(boardToSolve);

    }
}
