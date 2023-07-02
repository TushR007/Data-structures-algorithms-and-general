import java.util.*;
public class validSudoku {
    public static void main(String[] args) {
        String[][] board = 
        {{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};

        

        for(int i = 0;i <board[0].length;i++){
            HashMap<Integer,String> map = new HashMap<Integer,String>();
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] != "."){
                    if(map.containsValue(board[i][j])){
                        System.out.println("false");
                        return;
                    }
                    map.put(j,board[i][j]);   
                }
                
            }

            HashMap<Integer,String> map2 = new HashMap<Integer,String>();

            for(int k = 0;k < board[0].length;k++){
                
                if(board[k][i] != "."){
                    if(map2.containsValue(board[k][i])){
                        System.out.println("false");
                        return;
                    }

                    map2.put(k,board[k][i]);
                }

            }
        }

        System.out.println("true");
        return;

    }
}
