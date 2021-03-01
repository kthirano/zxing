package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

public class MockitoBinarizer extends Binarizer{
  private final LuminanceSource s;

  public MockitoBinarizer(LuminanceSource l){
    super(l);
    s = l;
  }

  @Override
  public BitArray getBlackRow(int y, BitArray row) throws NotFoundException {
    return null;
  }

  @Override
  public BitMatrix getBlackMatrix() throws NotFoundException {
    return null;
  }

  @Override
  public Binarizer createBinarizer(LuminanceSource source) {
    return new MockitoBinarizer(source);
  }


}
