// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    sign(11);
    
  }

  public static int sign(int num) {
    if(num > 0) {
      return 1;
    }
    else if( num < 0) {
      return -1;
    }
    else {
      return 0;
    }
  }
}
