    import java.util.Random;
    public class SumOrSameGame{
        private int[][] puzzle;

        public SumOrSameGame(int numRows, int numCols){
            puzzle = new int[numRows][numCols];
            Random r = new Random();

            for(int i = 0; i < numRows; i++){
                for(int j = 0; j < numCols; j++){
                    puzzle[i][j] = rand.nextInt(9) + 1;
                }
            }
        }
