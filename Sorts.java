public class Sorts{
  public static void selectionSort(int[] ary){
    for (int i = 0; i < ary.length; i++){
      int mins = ary[i];
      int index = i;
      for (int p = i; p < ary.length; p++){
        if (ary[p] < mins ){
          mins = ary[p];
          index = p;
        }
        int swap = ary[i];
        ary[index] = swap;
        ary[i] = mins;
      }
    }
  }


  public static void main(String[] args) {
    int[] ary = {1, 9, 14, 2, 343};
    selectionSort(ary);
    for (int i = 0; i < ary.length; i++){
      System.out.println(ary[i]);
    }
  }
}
