package info.dersify.crypto;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class JCEmeTest {

  private static final String ALGORITHM = "AES";

  @Test
  public void shouldReturnMaxLengthTest() throws NoSuchAlgorithmException {
    int maxKeyLength = JCEme.maxKeyLen(ALGORITHM);

  }
}
