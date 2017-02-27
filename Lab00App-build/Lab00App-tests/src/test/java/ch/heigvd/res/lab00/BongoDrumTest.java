package ch.heigvd.res.lab00;

import org.junit.Test;
import static org.junit.Assert.*;

public class BongoDrumTest {

  public BongoDrumTest(){}

  @Test
  public String aBongoDrumShouldMakeBongoBongo()
  {
    BongoDrum bongo = new BongoDrum();
    String message = bongo.sound();
    assertEquals(message, "bongo bongo");
  }
}

