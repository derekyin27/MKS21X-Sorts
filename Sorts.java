public class Sorts{
  public static void selectionSort(int [] ary){
    for (int i = 0; i < ary.length; i++){
      int min = ary[i];
      int index = i;
      for (int p = i; p < ary.length; p++){
        if (ary[p] < min){
          min = ary[p];
          index = p;
        }
        int swap = ary[i];
        ary[index] = swap;
        ary[i] = min;
      }
    }
  }
}
