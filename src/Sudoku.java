/**
 * This class contains all the methods required to solve and print a Sudoku board.
 */
public class Sudoku {

    //Only two class are protected because they are the ones to be accessed by the main method.
    //Rest of the classes are private.

    protected boolean solveBoard(int [][] board){
        for (int i=0; i<board.length;i++){
            for (int j=0; j<board.length;j++){
                if (board[i][j] == 0){
                    for (int number =1; number<10;number++){
                        if (allCheck(i,j,number,board)){
                            board[i][j] = number;
                            if (solveBoard(board)){
                                return true;
                            }else{
                                board[i][j] = 0;
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean horizontalCheck(int row, int number, int [][] board){
        for (int i=0; i<board.length;i++){
            if(board[row][i] == number){
                return false;
            }
        }
        return true;
    }

    private boolean verticalCheck(int col, int number, int [][] board) {
        for (int i=0; i<board.length;i++){
            if(board[i][col] == number){
                return false;
            }
        }
        return true;
    }

    private boolean subBoardCheck(int row, int col, int number, int[][] board){
        //Need to get the top left box of the 3x3 container the number is being placed in.
        int x = (row/3) *3;
        int y = (col/3) *3;
        //Now loop through the entire 9 boxes.
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                if(board[x+i][y+j]==number){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean allCheck(int row, int col, int number, int [][] board){
        return horizontalCheck(row, number, board) && verticalCheck(col, number, board) && subBoardCheck(row, col, number, board);
    }

    protected void printBoard(int [][] board){
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

