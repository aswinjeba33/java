class coding1{
  public static void main(String[] args) {

    String str = "kamala", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(" The number is palindrome");
    }
    else {
      System.out.println( " The number is not a palindrome");
    }
  }
}
