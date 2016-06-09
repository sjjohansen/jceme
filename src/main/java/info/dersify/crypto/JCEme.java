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

  public static int maxKeyLen(String algo) throws NoSuchAlgorithmException {
    int maxKeyLen = 0;
    maxKeyLen = Cipher.getMaxAllowedKeyLength(algo);
    return maxKeyLen;
  }
}

