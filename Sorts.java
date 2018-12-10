public class Sorts{
  public static void selectionSort(int[] ary){
    for (int i = 0; i < ary.length; i++){
      int mins = ary[i];
      int index = i;
      for (int p = i; p < ary.length; p++){
        if (ary[p] < mins){
          mins = ary[p];
          index = p;
        int swap = ary[i];
        ary[index] = swap;
        ary[i] = mins;
      }
    }
    }
  }

  public static void bubbleSort(int[] data){
    for (int p = 0; p < data.length-1; p++){
    for (int i = 0; i < data.length-1; i++){
      if (data[i+1] < data[i]){
        int swap = data[i];
        data[i] = data[i+1];
        data[i+1] = swap;
      }
    }
  }
  }

  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length-1; i++){
      if (ary[i] <= ary[i-1]){
        
      }
    }
  }


  public static void main(String[] args) {
    int[] ary = {190, -97, 1423, 78, 343};
    selectionSort(ary);
    for (int i = 0; i < ary.length; i++){
      System.out.println(ary[i]);
    }
    int[] data = {190, -97, 1423, 78, 343};
    bubbleSort(data);
    for (int i = 0; i < ary.length; i++){
      System.out.println(ary[i]);
  }
}
}
