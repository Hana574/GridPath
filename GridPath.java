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
        if (row != 4 && col != 4)
        {
            if (grid[row][col + 1] < grid[row + 1][col])
            {
                x = new Location(row, col + 1);
                System.out.print(x.getRow());
                System.out.print(x.getCol());
            }
            if (grid[row][col + 1] > grid[row + 1][col])
            {
                x = new Location(row + 1, col);
                System.out.print(x.getRow());
                System.out.print(x.getCol());
            } 
            return x;
        }
        else if (col == 4 && row != 4)
        {
            x = new Location(row + 1, col);
            System.out.print(x.getRow());
            System.out.print(x.getCol());
        } 
        else if (col != 4 && row == 4)
        {
            x = new Location(row, col + 1);
            System.out.print(x.getRow());
            System.out.print(x.getCol());
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
    public void sumPath(int row, int col) {
        int num = grid[row][col];
        System.out.println("RUNNING");
        while ((row != 4) || (col != 4)){
        Location x = getNextLoc(row, col);
        row = x.getRow();
        col = x.getCol();
        System.out.println("ROW: " + row + " Col: " + col);
        num += grid[x.getRow()][x.getCol()];
        System.out.println(num);
        }
        //if ((row == 4) && (col == 4)) num += grid[4][4];
        System.out.println("SUM: " + num);


        /* to be implemented in part (b) */ }
}