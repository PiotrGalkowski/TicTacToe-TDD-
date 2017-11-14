package pl.javaprogrammer;

public class TicTacToe {

    private Character[][] board = {{'\0', '\0', '\0'},{'\0', '\0', '\0'},{'\0', '\0', '\0'}};


    public void play(int x, int y) {

        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
    }

    private void checkAxis(int axis){
        if ((axis<1) || (axis>3)){
            throw new RuntimeException("Wartość X wykracza poza planszę");
        }
    }

    private void setBox(int x, int y){
        if(board[x-1][y-1] != '\0'){
            throw new RuntimeException("Pole jest już zajęte");

        }else {
            board[x-1][y-1] = 'X';
        }
    }
}
