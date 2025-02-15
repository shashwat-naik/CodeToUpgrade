import java.util.*;

public class N_Queen {
    static List<String> construct(char board[][]) {
        List<String> res = new ArrayList<>();
        for (char[] chars : board) {
            res.add(new String(chars));
        }
        return res;
    }

    public static void solve(int col, char[][] board, List<List<String>> result, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        if (col == board.length) { 
            result.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0
                    && upperDiagonal[board.length - 1 + col - row] == 0) {
                
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                
                solve(col + 1, board, result, leftRow, lowerDiagonal, upperDiagonal);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        List<List<String>> result = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        solve(0, board, result, leftRow, lowerDiagonal, upperDiagonal);

        return result;
    }

    public static void main(String[] args) {
        int n = 4; 
        List<List<String>> queen = solveNQueens(n);
        
        int i = 1;
        for (List<String> x : queen) {
            System.out.println("Arrangement " + i + ":");
            for (String s : x) {
                System.out.println(s);
            }
            System.out.println();
            i++;
        }
    }
}
