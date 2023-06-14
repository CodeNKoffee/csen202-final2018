public class three {
  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // [1][1] - [1][2] & [2][1] - [1][3] & [2][2] & [3][1] - [2][3] & [3][2] - [3][3]
    antiDiagonal(arr);
  }

  public static int[][] antiDiagonal(int[][] x) {
    int[][] res = new int[2 * x.length - 1][];
    int s = 0;

    for (int i = 0; i < res.length; i++) {
      if (i <= res.length / 2) {
        s = i + 1;
      }
      else s = s - 1;

      res[i] = new int[s];
      
      for (int j = i, r = 0; j >= 0 && r < res[i].length; j--) {
        if ((i - j) < x.length && j < x.length) {
          res[i][r] = x[i - j][j];
          r++;
        }
      }
    }
    return res;
  }
}
