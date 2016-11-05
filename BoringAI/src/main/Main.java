package main;

public class Main {
	public static void main(String[] args){
		GUI.genWin();
		
		Board board=new Board();
		board.boardInit();
		board.refresh();
		board.set(2, 2, Space.type.White);
		board.set(3, 3, Space.type.Black);
		board.show();
	}
}
