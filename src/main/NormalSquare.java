package main;

public class NormalSquare extends Square {

	@Override
	public void display() {
		if (marked)
			IOUtil.print("F");
		else if (!isOpen()) {
			IOUtil.print("X");
		} else if (!marked)
			IOUtil.print("N");
	}

	@Override
	public boolean isMine() {
		// TODO Auto-generated method stub
		return false;
	}

}
