public class Main {
    public static void main(String[] args) {
        int[][] nums = {
            {12, 3, 4, 13, 5},
            {11, 21, 2, 14, 16},
            {7, 8, 9, 15, 0},
            {10, 17, 20, 19, 1},
            {18, 22, 30, 25, 6}
        };
        GridPath z = new GridPath(nums);
        int sum = 0;
        Location loc = z.getNextLoc(3, 3);
        sum = sum + nums[loc.getRow()][loc.getCol()];
        System.out.println(loc.getRow());
        System.out.println(loc.getCol());
        System.out.println(nums[loc.getRow()][loc.getCol()]);
        System.out.print(sum);
        z.sumPath(3, 3);
    }
}