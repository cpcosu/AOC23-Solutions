import java.util.*;
public class sol{
	// breadth-first search
	public static int count(boolean[][] visited, int[][] board, int x, int y){
		// linked lists to hold coords
		var xq = new LinkedList<Integer>();
		var yq = new LinkedList<Integer>();
		var side=board.length;
		// keep track of count
        int total=0;
		// add x and y to fringe
		xq.add(x);
		yq.add(y);
		// repeat until we have no coords left to look at
		while(xq.size()>0){
			x=xq.remove();
			y=yq.remove();
			// if outside the box or alread visited, we ignore x and y
			if(x < 0 || x >= side || y < 0 || y >= side || visited[y][x])continue;

			//if we are seeing (y,x) for the first time:
			if(board[y][x]!=0){
				// add to counter
				total++;
				// mark as 'visited'
				visited[y][x]=true;
				// add neighbors to the fringe
				xq.add(x+1);yq.add(y);
				xq.add(x-1);yq.add(y);
				xq.add(x);yq.add(y+1);
				xq.add(x);yq.add(y-1);
			}
		}
		// return total
		return total;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		// read input
        int x=in.nextInt(), y=in.nextInt(), side=in.nextInt();
        int[][] board = new int[side][side];
        
		// scan ints for board
        for(int i = 0; i < side; i++){
            for(int j = 0; j < side; j++){
                board[i][j] = in.nextInt();
            }
        }
		// create a 'visited' set
        boolean[][] visited = new boolean[side][side];
		// call helper func to bfs 
        System.out.println(count(visited,board,y,x));
        in.close();
    }
}