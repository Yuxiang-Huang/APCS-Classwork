public class makeWord{
  public static void makeWords(int size, String ans){
    if (size == 0){
      System.out.println(ans);
    }
    else{
      for (char c = 'a'; c <= 'c'; c++){
        makeWords(size - 1, ans + c);
      }
    }
  }

  public static void main (String[] args){
    makeWords(3, "");
    for (char c = 'a'; c <= 'z'; c++){
      System.out.print(c);
    }
    System.out.println();
  }
}
