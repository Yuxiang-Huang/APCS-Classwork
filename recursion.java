public class recursion{
  public static int fact(int x){
    if (x > 0){
      return x * fact(x - 1);
    }
    else{
      return 1;
    }
  }

  public static boolean isEven(int x){
    if (x == 1){
      return false;
    }
    else if (x == 0){
      return true;
    }
    else{
      return isEven(x -= 2);
    }
  }

  public static int fibonacci(int n) {
  if (n == 0){
    return 0;
  }
  else if (n == 1){
    return 1;
  }
  else{
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}


  public static void main (String[] args){
    System.out.println(fibonacci(47));
    // int x = 0;
    // while (x < 30){
    //   //system.out.println(fact(x));
    //   System.out.println(fibonacci(x));
    //   x += 1;
    // }

    //System.out.println();

    //System.out.println(isEven(88347));
    // int y = 0;
    // while (y < 100000){
    //   System.out.println(isEven(y));
    //   y += 1;
    // }
  }
}
