package main;

public class MinesweeperGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOUtil.printLine("Enter Minefield Layout:");
		String input;
		boolean completed = false;

		input = IOUtil.readInput();
		String[] layout = input.split(",");
		MineField field = new MineField(layout);
		while (!completed) {
			IOUtil.printLine("Enter Option:");
			input = IOUtil.readInput();
			completed = field.reactToInput(input);
		}

	}

}
