import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;

class JCEme {
  public static void main(String[] args) {
    try {
      int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
      System.out.println(maxKeyLen);
    } catch (NoSuchAlgorithmException e) {
    }
  }
}

