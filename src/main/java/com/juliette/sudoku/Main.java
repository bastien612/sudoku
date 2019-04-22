package com.juliette.sudoku;

import java.util.HashMap;

import com.juliette.sudoku.grid.Square;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Square> sudokuGrid = new HashMap<String, Square>();
		
		sudokuGrid.put("0-0", new Square(0,0, 40));
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sudokuGrid.put(i + "-" + j, new Square(i, j, null));
			}
		}
		
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		sudokuGrid.get("0-3").setValue(6);
		
		Square[] row1 = new Square[9];
		for(int i = 0; i < 9; i++) {
			row1[i] = sudokuGrid.get("0-" + i);
		}
		
//		 = {
//				
//				sudokuGrid.get("0-1"),
//				sudokuGrid.get("0-2"),
//				new Square(1, 4, null),
//				new Square(1, 5, null),
//				new Square(1, 6, null),
//				new Square(1, 7, null),
//				new Square(1, 8, null),
//				new Square(1, 9, null)
//		};
		
		Square[] column1 = {
				
				sudokuGrid.get("0-0"),
				new Square(1,2,null),
				new Square(1,3,null),
				new Square(1,4,null),
				new Square(1,5,null),
				new Square(1,6,null),
				new Square(1,7,null),
				new Square(1,8,null),
				new Square(1,9,null)
		};
		
		
		
//		for(int i = 0; i < 9; ++i) {
//			System.out.println("Print column : " + row1[i].getValue());
//		}
	}
}
