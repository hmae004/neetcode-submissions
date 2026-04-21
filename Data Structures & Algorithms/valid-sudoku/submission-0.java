class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Set<Character>> col = new HashMap<>();
        HashMap<Integer,Set<Character>> row = new HashMap<>();
        HashMap<Integer,Set<Character>> square = new HashMap<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];
                if(val=='.'){
                    continue;
                }
                if((row.getOrDefault(r,new HashSet<>())).contains(val)||
                (col.getOrDefault(c,new HashSet<>())).contains(val)||
                (square.getOrDefault((r/3)*3+(c/3),new HashSet<>())).contains(val)){
                    return false;
                }
                row.computeIfAbsent(r,k->new HashSet<>()).add(val);
                col.computeIfAbsent(c,k->new HashSet<>()).add(val);
                square.computeIfAbsent((r/3)*3+(c/3),k->new HashSet<>()).add(val);
            }
        }
        return true;
    }
}
