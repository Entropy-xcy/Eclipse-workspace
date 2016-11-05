package main;

public class Space {
	Vec2 position;
	enum type{
		Black,White,Blank
	}
	type piece;
	
	Space(int x,int y){
		this.position=new Vec2(x,y);
	}
	
	Space(int x,int y, type tp){
		this.position=new Vec2(x,y);
		this.piece=tp;
	}
	
	
}
