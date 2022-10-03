package top_interview_questions.medium;

public class ValidSudoku_36 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};

        int len = board.length;
        boolean valid = true;

        for(int i = 0; i < len; i++){
            int[] nums = new int[9];
            for(int j = 0; j< len; j++){
                if(board[i][j]!='.'){
                    if(nums[Integer.parseInt(board[i][j]+"")-1] != 0) {
                        valid = false;
                        break;
                    }
                    else{
                        nums[Integer.parseInt(board[i][j]+"")-1]++;
                    }
                }

            }
        }

        for(int j = 0; j < len; j++){
            int[] nums = new int[9];
            for(int i = 0; i< len; i++){
                if(board[i][j]!='.'){
                    if(nums[Integer.parseInt(board[i][j]+"")-1] != 0) {
                        valid = false;
                        break;
                    }
                    else{
                        nums[Integer.parseInt(board[i][j]+"")-1]++;
                    }
                }

            }
        }


        int l = 0;

        while(l < 7){
            int k = 0;
            while(k<7){
                int[] nums = new int[9];
                for(int i = l; i < l+3; i++){
                    for(int j = k; j < k+3; j++){
                        if(board[i][j]!='.'){
                            if(nums[Integer.parseInt(board[i][j]+"")-1] > 0) {
                                valid = false;
                                break;
                            }
                            else{
                                nums[Integer.parseInt(board[i][j]+"")-1]++;
                            }
                        }
                    }
                }
                k += 3;
            }
            l+=3;
        }
        System.out.println(valid);

    }
}
