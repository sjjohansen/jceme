package info.dersify.crypto;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;



class JCEme {

  private static final String ALGORITHM = "AES";

  public static void main(String[] args) {
    try {
      System.out.println(maxKeyLen(ALGORITHM));
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }

  static int maxKeyLen(String algo) throws NoSuchAlgorithmException {
    return Cipher.getMaxAllowedKeyLength(algo);
  }
}

