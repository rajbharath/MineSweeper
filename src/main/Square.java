package main;

public abstract class Square {
	protected boolean marked;
	protected boolean openState;

	public abstract void display();

	public abstract boolean isMine();

	public void mark() {
		// TODO Auto-generated method stub
		marked = true;
	}

	public void unMark() {
		// TODO Auto-generated method stub
		marked = false;
	}

	public boolean isOpen() {
		return openState;
	}

	public void open() {
		openState = true;
	}
}
