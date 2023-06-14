public class one {
  public static void main(String[] args) {
    int len = args.length;
    int n = Integer.parseInt(args[0]);
    int[] x = new int[len - 1];
    for (int i = 1; i < args.length; i++) {
      x[i - 1] = Integer.parseInt(args[i]);
    }
    sumArray(x, n);
  }

  // Exercise 1A & B
  public static void sumArray(int[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] + arr[i] == n) {
          System.out.println(arr[j] +" + "+ arr[i] +" = "+ n);
        }
      }
    }
  }
} 