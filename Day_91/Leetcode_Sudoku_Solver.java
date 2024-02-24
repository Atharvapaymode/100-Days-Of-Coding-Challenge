class Solution {
    public boolean solve(char[][] board, int row, int col){
        if(row==board.length){
            return true;
        }

        //if the row ends then we will move to next row and colunm will be started again from 0
        if(col == board[0].length){
            return solve(board, row+1, 0);
        }

        //if there is a number already filled then we will skip it
        if(board[row][col] != '.'){
            return solve(board, row, col+1);
        }

        //trying different numbers for the cell
        for(char i='1'; i<='9'; i++){
            if(isSafe(board, row, col, i)){ //checking if a particular number is valid or not at that place 
                board[row][col] = i; //writing number at the current cell
                //checking that next part of the sudoku is solved or not
                if(solve(board,row,col+1)){
                    return true; 
                }
                else{
                    //backtracking by removing the numbers which are wrong
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, int num){
        //checking row wise
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }

        //checking column wise 
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //checking the 3x3 outer box
        int sqrt = (int)(Math.sqrt(board.length)); //it will find the length of the boxes of the sudoku i.e. 3 for this question
        int rowStart = row - row%sqrt;  //to find the starting position of the current box
        int colStart = col - col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++){ //it will go till the end of the box (start index + length of the box)
            for(int j=colStart;j<colStart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        //if the number is not present at any of the cases then return true that yes it is the right place
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}
