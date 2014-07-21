package main;

public class MineSquare extends Square {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (marked)
			IOUtil.print("F");
		else if (!isOpen()) {
			IOUtil.print("X");
		} else if (!marked)
			IOUtil.print("M");
	}

	@Override
	public boolean isMine() {
		// TODO Auto-generated method stub
		return true;
	}

}
