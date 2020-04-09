public class FindMax {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] a = {{-3,2,3,4,5},
                     {6,7,8,9,10},
                     {100,3,4,5,1},
                     {54,700,2,1,5},
                     {5,4,3,-45,1}};
        int min = a[0][0];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        System.out.println("Min của mảng là: " + min);
    }
}
