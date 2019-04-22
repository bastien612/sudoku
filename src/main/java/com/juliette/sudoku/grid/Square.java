package com.juliette.sudoku.grid;

public class Square {
	private Integer row;
	private Integer column;
	private Integer value;
	
	public Square(Integer myRow, Integer myColumn, Integer myValue){
		this.row = myRow;
		this.column = myColumn;
		this.value = myValue;
	}
	
	public String getKey() {
		return this.row + "-" + this.column;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
