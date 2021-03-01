package com.google.zxing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class BitMapMockito extends Assert{
  @Spy
  private MockitoBinarizer bMock;
  private MockitoLuminance lMock;

  @Before
  public void setup(){
    lMock = mock(MockitoLuminance.class);
    bMock = new MockitoBinarizer(lMock);
  }

  @Test
  public void BinaryBitmapMock() {
    when(lMock.isCropSupported()).thenReturn(true);
    System.out.println(lMock.getClass());
    BinaryBitmap BBM = new BinaryBitmap(bMock);
    assertEquals(BBM.getWidth(), 0);
    assertEquals(BBM.isCropSupported(), true);
    verify(lMock, times(1)).isCropSupported();
  }
}

