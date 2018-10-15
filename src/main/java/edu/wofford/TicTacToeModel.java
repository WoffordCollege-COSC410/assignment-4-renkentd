package edu.wofford;


public class TicTacToeModel {

    public enum Mark { EMPTY, XMARK, OMARK };
    public enum Result { XWIN, OWIN, TIE, NONE };
    private static Mark[][] Board;
    private static boolean xTurn;
    private static boolean gameOver;

    public TicTacToeModel() {
        Board = new Mark[3][3];
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Board[i][j] = Mark.EMPTY;
            }
        }
        xTurn = true;
        gameOver = false;

    }
    
    public boolean setMarkAt(int row, int col) {
        if (gameOver == false && Board[row][col] == Mark.EMPTY){
            if(xTurn){
                Board[row][col] = Mark.XMARK;
            }
            else{
                Board[row][col] = Mark.OMARK;
            }
            xTurn = !xTurn;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean fullBoard(){
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                if (Board[row][col] == Mark.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    
    public Mark getMarkAt(int row, int col) {
        return Board[row][col];
    }

    public Result getResult() {
        if( Board [0][0]==Board[1][0] && Board[1][0] == Board[2][0] && (Board [0][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [0][0]==Board[1][0] && Board[1][0] == Board[2][0] && (Board [0][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [0][1]==Board[1][1] && Board[1][1] == Board[2][1] && (Board [0][1]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [0][1]==Board[1][1] && Board[1][1] == Board[2][1] && (Board [0][1]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [0][2]==Board[1][2] && Board[1][2] == Board[2][2] && (Board [0][2]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [0][2]==Board[1][2] && Board[1][2] == Board[2][2] && (Board [0][2]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [0][0]==Board[0][1] && Board[0][1] == Board[0][2] && (Board [0][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [0][0]==Board[0][1] && Board[0][1] == Board[0][2] && (Board [0][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [1][0]==Board[1][1] && Board[1][1] == Board[1][2] && (Board [1][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [1][0]==Board[1][1] && Board[1][1] == Board[1][2] && (Board [1][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [2][0]==Board[2][1] && Board[2][1] == Board[2][2] && (Board [2][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [2][0]==Board[2][1] && Board[2][1] == Board[2][2] && (Board [2][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [0][0]==Board[1][1] && Board[1][1] == Board[2][2] && (Board [0][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [0][0]==Board[1][1] && Board[1][1] == Board[2][2] && (Board [0][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if( Board [2][0]==Board[1][1] && Board[1][1] == Board[0][2] && (Board [2][0]== Mark.XMARK)){
            gameOver = true;
            return Result.XWIN;
        }
        else if( Board [2][0]==Board[1][1] && Board[1][1] == Board[0][2] && (Board [2][0]== Mark.OMARK)){
            gameOver = true;
            return Result.OWIN;
        }
        else if ( fullBoard() == true ){
            gameOver = true;
            return Result.TIE;
        }
        else{
            return Result.NONE;
        }
    }
    
    public String toString() {
        return "";
    }    

}