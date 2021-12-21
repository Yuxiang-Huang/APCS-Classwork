import java.util.*;

public class stringToInt{
  public static void main (String[] args){
    System.out.println(stringToInt("324876576") == Integer.parseInt("324876576"));
    System.out.println(stringToInt("-238747") == Integer.parseInt("-238747"));
    System.out.println(stringToInt("7") == Integer.parseInt("7"));
    System.out.println(stringToInt("-9") == Integer.parseInt("-9"));
    System.out.println(stringToInt("0") == Integer.parseInt("0"));

    try{
      System.out.println(stringToInt("bndeiur"));
    } catch (IllegalArgumentException e){
      System.out.println("nice catch");
    }
  }

  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    boolean flag = false;
    if (s.charAt(0) == '-'){
      flag = true;
      s = s.substring(1);
    }
    int ans = 0;
    String newS = "";
    for (int x = s.length() - 1; x >= 0; x --){
      newS += s.charAt(x);
    }
    for (int x = 0; x < newS.length(); x++){
      ans += valueOfDigit(newS.charAt(x)) * Math.pow(10, x);
    }
    if (flag){
      return ans * -1;
    }
    return ans;
  }

  public static int valueOfDigit(char c){
    if (c == '0'){
      return 0;
    }
    if (c == '1'){
      return 1;
    }
    if (c == '2'){
      return 2;
    }
    if (c == '3'){
      return 3;
    }
    if (c == '4'){
      return 4;
    }
    if (c == '5'){
      return 5;
    }
    if (c == '6'){
      return 6;
    }
    if (c == '7'){
      return 7;
    }
    if (c == '8'){
      return 8;
    }
    if (c == '9'){
      return 9;
    }
    else{
      throw new IllegalArgumentException ("Can not convert to int because of bad number format");
    }
  }
}
