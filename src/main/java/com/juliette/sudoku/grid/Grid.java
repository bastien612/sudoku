package com.juliette.sudoku.grid;

public class Grid {

	Square[][] matrix;
	
	public Grid() {
		matrix = new Square[9][9];
		for(int i=0; i < 9; i++) {
			for(int j=0; j < 9; j++) {
			 matrix[i][j] = new Square(i, j);
			}
		}
	}
	
	public void initSquare(int i, int j, int value) {
		matrix[i][j].setValue(value);
	}
	
	public void findNumber () {
	
	}
	

	 public void displayGrid() {
		
		for(int i=0; i < 9; i++) {
			for(int j=0; j < 9; j++) {
				System.out.print("|_"+matrix[i][j].getDiplayableValue() + "_");
				if (j == 2 || j == 5 ) {
					System.out.print("|");
				}
				if (j == 8) {
					System.out.print("|\n");
					
				}
					
			}
		}
			
					
					
	}
}