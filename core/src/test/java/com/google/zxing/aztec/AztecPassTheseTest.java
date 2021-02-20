package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.AbstractBlackBoxTestCase;

public class AztecPassTheseTest extends AbstractBlackBoxTestCase {
  public AztecPassTheseTest() {
    super("src/test/resources/blackbox/aztec-pass", new AztecReader(), BarcodeFormat.AZTEC);
    addTest(5,5,0.0f);
    addTest(5,5,90.0f);
    addTest(5,5,180.0f);
    addTest(5,5,270.0f);
  }
}
