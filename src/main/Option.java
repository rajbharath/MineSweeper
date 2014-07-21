package main;

public class Option {

	private int row;
	private int column;

	public Option(String row, String column) {
		// TODO Auto-generated constructor stub
		setRow(Integer.parseInt(row));
		setColumn(Integer.parseInt(column));
	}

	public int getColumn() {
		return column;
	}

	private void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	private void setRow(int row) {
		this.row = row;
	}

	public static Option parse(String option) {
		if (isValid(option)) {
			return new Option(Character.toString(option.charAt(2)),
					Character.toString(option.charAt(4)));
		}
		return null;
	}

	private static boolean isValid(String option) {
		// TODO Auto-generated method stub
		return option.length() == 6;
	}
}
