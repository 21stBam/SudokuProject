/*
 * To change Sudoku template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuproject;

/**
 *
 * @author Obsa
 */
public class SudokuModel {
    private int [][] sudoku;
    public SudokuModel(){
        sudoku = new int [9][9];
    }
    
    public boolean isSolved(int i, int j, int num, int[][] sudoku) {
        for (int n = 0; n < 9; ++n)  // row
            if (num == sudoku[n][j])
                return false;

        for (int n = 0; n < 9; ++n) // col
            if (num == sudoku[i][n])
                return false;

        int Rowset = (i / 3)*3;
        int Colset = (j / 3)*3;
        for (int n = 0; n < 3; ++n) // box
            for (int m = 0; m < 3; ++m)
                if (num == sudoku[Rowset+n][Colset+m])
                    return false;

        return true; // no violations, so it's legal
    }

    public int[][] getNewGame(int x) {
       SudokuModel Sudoku = new SudokuModel();
       if (x == 1) {
       for (int i = 0; i <= 8; i++)  {
           for (int j = 0; j <= 8; j++)  {
                Sudoku.sudoku[i][j] = -1;
           }
       }     
    Sudoku.sudoku[1][0] = 6;
    Sudoku.sudoku[0][2] = 3;
    Sudoku.sudoku[2][1] = 9;
    Sudoku.sudoku[0][5] = 8;
    Sudoku.sudoku[0][7] = 2;
    Sudoku.sudoku[1][3] = 3;
    Sudoku.sudoku[1][8] = 9;
    Sudoku.sudoku[2][3] = 7;
    Sudoku.sudoku[2][6] = 1;
    Sudoku.sudoku[2][8] = 4;
    Sudoku.sudoku[3][0] = 9;
    Sudoku.sudoku[3][3] = 2;
    Sudoku.sudoku[3][6] = 5;
    Sudoku.sudoku[3][7] = 4;
    Sudoku.sudoku[3][8] = 3;
    Sudoku.sudoku[4][1] = 8;
    Sudoku.sudoku[4][3] = 4;
    Sudoku.sudoku[4][5] = 1;
    Sudoku.sudoku[5][0] = 4;
    Sudoku.sudoku[5][1] = 6;
    Sudoku.sudoku[5][2] = 2;
    Sudoku.sudoku[5][5] = 7;
    Sudoku.sudoku[5][8] = 1;
    Sudoku.sudoku[6][0] = 1;
    Sudoku.sudoku[6][2] = 6;
    Sudoku.sudoku[6][5] = 3;
    Sudoku.sudoku[6][7] = 9;
    Sudoku.sudoku[7][0] = 8;
    Sudoku.sudoku[7][5] = 9;
    Sudoku.sudoku[7][6] = 3;
    Sudoku.sudoku[7][8] = 6;
    Sudoku.sudoku[8][1] = 1;
    Sudoku.sudoku[8][3] = 6;
    Sudoku.sudoku[8][6] = 7;
        }
        
        return Sudoku.sudoku;
    }
    
}
