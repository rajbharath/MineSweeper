package main;

public class SquareFactory {

	public static Square makeSquare(char squareType) {
		switch (squareType) {
		case 'm':
			return new MineSquare();
		case 'x':
			return new NormalSquare();
		default:
			return null;
		}
	}
}
