//Java solution
import java.util.Scanner;

public class solution{

    public static int count(boolean[][] isVisited, int[][] board, int init_x, int init_y){
        int res = 0;
        //out of bounds
        if(init_x < 0 || init_x > 2 || init_y < 0 || init_y > 2){
            res = 0;
        //if people are not into rumors
        }else if(board[init_x][init_y] == 0){
            res = 0;
        //if the place is already visited
        }else if(isVisited[init_x][init_y]){
            res = 0; 
        }else{
            //one person gets rumors
            res = 1;
            //mark it "visited" to avoid double counting
            isVisited[init_x][init_y] = true;
            res += count(isVisited, board, init_x+1, init_y);
            res += count(isVisited, board, init_x-1, init_y);
            res += count(isVisited, board, init_x, init_y-1);
            res += count(isVisited, board, init_x, init_y+1);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String[] posArr =  scnr.nextLine().split(" ");
        int init_x = Integer.parseInt(posArr[0]);
        int init_y = Integer.parseInt(posArr[1]);
        int[][] board = new int[3][3];
        for(int i = 0; i < 3; i++){
            String[] row = scnr.nextLine().split(" ");
            board[i][0] = Integer.parseInt(row[0]);
            board[i][1] = Integer.parseInt(row[1]);
            board[i][2] = Integer.parseInt(row[2]);
        }
        boolean[][] isVisited = new boolean[3][3]; 
        System.out.println(count(isVisited,board,init_x,init_y));
        scnr.close();
    }
}