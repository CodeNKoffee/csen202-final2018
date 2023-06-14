public class two {
  public static void main(String[] args) {
    int[] list1 = {4, 5, 6, 7, 8};
    int[] list2 = {2, 3, 4, 8, 10, 16};
    int i = 0, j = 0;
    commonElements(list1, list2, i, j);
  }

  // Exercise 2
  public static void commonElements(int[] l1, int[] l2, int i, int j) {
    if (i == l1.length || j == l2.length) {
      System.out.println("Done!");
    }
    else if (l1[i] == l2[j]) {
      System.out.println(l1[i]);
      commonElements(l1, l2, ++i, ++j);
    }
    else if (l1[i] < l2[j]) {
      commonElements(l1, l2, ++i, j);
    }
    else commonElements(l1, l2, i, ++j);
  }
}
