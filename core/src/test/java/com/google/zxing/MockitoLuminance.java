package com.google.zxing;

public class MockitoLuminance extends LuminanceSource{
  public MockitoLuminance(int x, int y){
    super(x, y);
  }

  @Override
  public byte[] getRow(int y, byte[] row) {
    return new byte[0];
  }

  @Override
  public byte[] getMatrix() {
    return new byte[0];
  }
}
