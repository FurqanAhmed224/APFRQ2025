public boolean clearPair(int row, int col){
            int target = puzzle[row][col];

            if(target == 0){
                return false;
            }

            for(int i = row; i < puzzle.lengthl i++){
                for(int j = 0; j < puzzle[i].length; j++){
                    if((puzzle[i][j] == target || puzzle[i][j] + target == 10) && puzzle[i][j] != 0){
                        puzzle[row][col] = 0;
                        puzzle[i][j] = 0;
                        return true;    
                    }
                }
            }

            return false;
        }
    }
