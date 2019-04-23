package com.juliette.sudoku.grid;

public class Square {
	private int row;
	private int column;
	private int value;
	
	public Square(int myRow, int myColumn, int myValue){
		this.row = myRow;
		this.column = myColumn;
		this.value = myValue;
	}
	
	public Square(int myRow, int myColumn) {
		this.row = myRow;
		this.column = myColumn;
		this.value = -1;
	}
	
	public String getKey() {
		return this.row + "-" + this.column;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDiplayableValue() {
		if (value == -1) {
			return " ";
		} else {
			return "" + value;
		}
	}
}
