package com.google.zxing.oned;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.common.AbstractBlackBoxTestCase;

/**
 * @author Kohsuke Hirano
 */
public final class EAN13BlackBoxAddedTestCase extends AbstractBlackBoxTestCase {

  public EAN13BlackBoxAddedTestCase() {
    super("src/test/resources/blackbox/ean13-new", new MultiFormatReader(), BarcodeFormat.EAN_13);
    addTest(0, 0, 0.0f);
    //addTest(27, 32, 180.0f);
  }

}
