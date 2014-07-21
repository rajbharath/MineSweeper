package main;

public class MineField {
	private Square[][] squares;
	private int squaresStepped;
	private int totalNonMineSquares;

	public MineField(String layout[]) {
		squares = new Square[layout.length][layout.length];
		initialiseSquares(layout);
	}

	private void initialiseSquares(String[] layout) {
		// TODO Auto-generated method stub
		int squareIndex = 0;
		for (String rowLayout : layout) {
			formLayoutRowWithReferenceRow(squares[squareIndex], rowLayout);
			squareIndex++;
		}
	}

	private void formLayoutRowWithReferenceRow(Square[] squareRow, String row) {
		// TODO Auto-generated method stub
		for (int i = 0; i < row.length(); i++) {
			squareRow[i] = SquareFactory.makeSquare(row.charAt(i));
			if (!squareRow[i].isMine()) {
				totalNonMineSquares++;
			}
		}
	}

	public boolean step(String steppedSquare) {
		Option stepped = Option.parse(steppedSquare);
		Square square = squares[stepped.getRow()][stepped.getColumn()];
		square.open();
		if (!square.isMine()) {
			squaresStepped++;
		} else {
			return displayLoseMessage();
		}
		display();
		return steppedAllNonMines();
	}

	public void mark(String squareToMark) {

		Option stepped = Option.parse(squareToMark);
		Square square = squares[stepped.getRow()][stepped.getColumn()];
		square.mark();
		display();
	}

	private boolean displayLoseMessage() {
		// TODO Auto-generated method stub
		IOUtil.printLine("You Stepped in Mine");
		return true;
	}

	public void display() {

		for (Square[] squareRow : squares) {
			for (Square square : squareRow) {
				square.display();
			}
			IOUtil.printLine("");
		}

	}

	public boolean reactToInput(String input) {
		if (input.charAt(0) == 'o')
			return step(input);
		else if (input.charAt(0) == 'f')
			mark(input);
		return false;
	}

	public boolean steppedAllNonMines() {
		if (squaresStepped == totalNonMineSquares) {
			IOUtil.printLine("You won");
		}
		return squaresStepped == totalNonMineSquares;
	}
}
