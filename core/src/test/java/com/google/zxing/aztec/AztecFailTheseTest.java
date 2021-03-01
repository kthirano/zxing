package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.AbstractBlackBoxTestCase;


public class AztecFailTheseTest extends AbstractBlackBoxTestCase {
  public AztecFailTheseTest() {
    super("src/test/resources/blackbox/aztec-fail", new AztecReader(), BarcodeFormat.AZTEC);
    addTest(0,0,0.0f);
    addTest(0,0,90.0f);
    addTest(0,0,180.0f);
    addTest(0,0,270.0f);
  }
}
