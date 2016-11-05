package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Board board=new Board();
		board.boardInit();
		board.show();
		
		String input=sc.nextLine();
		
		System.out.println(input);
		
	}
}
