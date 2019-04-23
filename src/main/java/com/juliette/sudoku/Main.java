package com.juliette.sudoku;

import java.util.HashMap;

import com.juliette.sudoku.grid.Grid;
import com.juliette.sudoku.grid.Square;

public class Main {

	public static void main(String[] args) {
		
		Grid myGrid = Main.initGrid();
		myGrid.displayGrid();
		
		
	}
	
	static Grid initGrid () {
		Grid grid = new Grid();
		
		grid.initSquare(0, 3, 6);
		grid.initSquare(0, 6, 3);
		grid.initSquare(0, 8, 4);
		
		grid.initSquare(1, 1, 3);
		grid.initSquare(1, 2, 2);
		grid.initSquare(1, 4, 1);
		grid.initSquare(1, 6, 7);
		grid.initSquare(1, 8, 5);
		
		grid.initSquare(2, 1, 4);
		grid.initSquare(2, 2, 7);
		grid.initSquare(2, 3, 3);
		grid.initSquare(2, 4, 2);
		
		grid.initSquare(3, 0, 9);
		grid.initSquare(3, 1, 6);
		grid.initSquare(3, 4, 8);
		
		grid.initSquare(4, 1, 2);
		grid.initSquare(4, 3, 7);
		grid.initSquare(4, 5, 5);
		grid.initSquare(4, 7, 1);
		
		grid.initSquare(5, 4, 6);
		grid.initSquare(5, 7, 5);
		grid.initSquare(5, 8, 3);
		
		grid.initSquare(6, 4, 3);
		grid.initSquare(6, 5, 6);
		grid.initSquare(6, 6, 9);
		grid.initSquare(6, 7, 8);
		
		grid.initSquare(7, 0, 3);
		grid.initSquare(7, 2, 6);
		grid.initSquare(7, 4, 9);
		grid.initSquare(7, 6, 2);
		grid.initSquare(7, 7, 4);
		
		grid.initSquare(8, 0, 4);
		grid.initSquare(8, 2, 9);
		grid.initSquare(8, 5, 1);
		
		return grid;
	}
}
