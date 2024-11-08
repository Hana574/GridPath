public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;
    public GridPath(int[][] y){
        grid = y;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        Location x = new Location(row, col);
        if (row != grid.length - 1 && col != grid[0].length - 1)
        {
            if (grid[row][col + 1] < grid[row + 1][col])
            {
                x = new Location(row, col + 1);
              //  System.out.print(x.getRow());
                //System.out.print(x.getCol());
            }
            if (grid[row][col + 1] > grid[row + 1][col])
            {
                x = new Location(row + 1, col);
             //System.out.print(x.getRow());
              //System.out.print(x.getCol());
            } 
            return x;
        }
        else if (col == grid[0].length - 1 && row != grid.length - 1)
        {
            x = new Location(row + 1, col);
           // System.out.print(x.getRow());
           // System.out.print(x.getCol());
        } 
        else if (col != grid[0].length - 1 && row == grid.length - 1)
        {
            x = new Location(row, col + 1);
          //  System.out.print(x.getRow());
           // System.out.print(x.getCol());
        } 
        return x;
        
    }
    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        int num = grid[row][col];
        //System.out.println("RUNNING");
        while (row != grid.length - 1 || col != grid[0].length - 1){
        Location x = getNextLoc(row, col);
        row = x.getRow();
        col = x.getCol();
        //System.out.println("ROW: " + row + " Col: " + col);
        num += grid[x.getRow()][x.getCol()];
        //System.out.println(num);
        }
        //System.out.println("SUM: " + num);
        return num;


        /* to be implemented in part (b) */ }
}