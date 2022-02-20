import java.util.*;

public class randomPasswordGenertor {
  public static void main(String[] args) {
    int length = 10;
    System.out.println(pass_generator(length));
  }

  static char[] pass_generator(int length) {
    System.out.println("Generating passowrd using random() :  ");
    System.out.println("Your new password is : ");
    String Smallnumber = "abcdefghijklmnopqrstuvwxyz";
    String CapitalNumber = "ABCDEFGHIJKLMNOPQRTSUVWXYZ";
    String numbers = "1234567890";
    String symbols = "!@#$%^&*_+=-/.?<>";
    String values = CapitalNumber + Smallnumber + numbers + symbols;
    Random rndm_methods = new Random();
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      password[i] = values.charAt(rndm_methods.nextInt(values.length()));
    }
    return password;
  }

}
