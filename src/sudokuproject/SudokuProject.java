/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuproject;

/**
 *
 * @author Brandon
 */
public class SudokuProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SudokuView theSudokuView = new SudokuView();
        SudokuModel theSudokuModel = new SudokuModel();
        SudokuController theSudokuController = new SudokuController(theSudokuView, theSudokuModel);
        theSudokuView.setVisible(true);
    }
}
