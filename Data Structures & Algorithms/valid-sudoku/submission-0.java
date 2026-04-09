class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        
        for(int i=0;i<m;i++){
            boolean[] seen=new boolean[10];
            boolean[] col=new boolean[10]; 
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'0';
                    if(seen[num]) return false;
                    seen[num]=true;
                }
                if(board[j][i]!='.'){
                    int num=board[j][i]-'0';
                    if(col[num]) return false;
                    col[num]=true;
                }
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                boolean[] box = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char val = board[r + i][c + j];
                        if (val != '.') {
                            int num = val - '0';
                            if (box[num]) return false;
                            box[num] = true;
                        }
                    }
                }
            }
            
        }
        return true;
    }
}

