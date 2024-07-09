package Recursion_Backtrackinng_Lecture_4;
public class N_Queen_Board_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=4;
        boolean [][]board=new boolean[n][n];
        queen(board,0,n);
	}
	public static void queen(boolean[][]board,int row,int tq) {
		if(tq==0) {
			display(board);
			return;
		}
		for(int col=0;col<board.length;col++) {
			if(isitsafe(board,row,col)) {
				board[row][col]=true;
				queen(board,row+1,tq-1);
				board[row][col]=false;
			}
		}
	}
	public  static boolean isitsafe(boolean[][]board,int row,int col) {
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
		r=row;
		int c=col;
		while(r>=0&&c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		r=row;
		c=col;
		while(r>=0&&c<board.length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void display(boolean[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
