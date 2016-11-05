

public class Board {
	Space[][] board=new Space[15][15];
	char[][] printable=new char[15][15];
	
	void boardInit(){
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				board[i][j]=new Space(i,j,Space.type.Blank);
			}
		}
	}
	
	Board(){
		boardInit();
	}
	
	void fill(){
		printable[0][0]='┌';
		printable[0][14]='┐';
		printable[14][0]='└';
		printable[14][14]='┘';
		for(int i=1;i<14;i++){
			printable[0][i]='┬';
		}
		for(int i=1;i<14;i++){
			printable[14][i]='┴';
		}
		for(int i=1;i<14;i++){
			printable[i][0]='├';
		}
		for(int i=1;i<14;i++){
			printable[i][14]='┤';
		}
		
		for(int i=1;i<14;i++){
			for(int j=1;j<14;j++){
				printable[i][j]='┼';
			}
		}
	}
	
	void refresh(){
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				if (board[i][j].piece==Space.type.Black){
					printable[i][j]='●';
				}
				if (board[i][j].piece==Space.type.White){
					printable[i][j]='○';
				}
			}
		}
	}
	
	void show(){
		System.out.print(' ');
		for(int i=0;i<15;i++){
			System.out.print(i);
			if(i<10){
				System.out.print(' ');
			}
		}
		System.out.println();
		for(int i=0;i<15;i++){
			System.out.print(i);
			if(i<10){
				System.out.print(' ');
			}
			for(int j=0;j<15;j++){
				System.out.print(printable[i][j]);
				if(j!=14){
					System.out.print('─');
				}
			}
			System.out.println();
		}
	}
	
	void set(int x,int y,Space.type tp){
		board[x][y].piece=tp;
	}
}
