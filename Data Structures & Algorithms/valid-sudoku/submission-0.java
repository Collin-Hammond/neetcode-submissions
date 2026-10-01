class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0;j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
            seen.clear();
        }

          for(int i = 0; i < 9; i++){
            for(int j = 0;j < 9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(seen.contains(board[j][i])){
                    return false;
                }
                seen.add(board[j][i]);
            }
            seen.clear();
        }

        for(int row = 0; row < 9; row+=3){
            for(int col = 0; col < 9; col+=3){
                for(int i = 0; i <= 2; i++){
                    for(int j = 0; j <= 2; j++){
                        if(board[row+i][col+j] == '.'){
                            continue;
                        }
                        if(seen.contains(board[row+i][col+j])){
                            return false;
                        }
                        seen.add(board[row+i][col+j]);
                    }
                }
                seen.clear();
            }
        }

        return true;

    }
}
