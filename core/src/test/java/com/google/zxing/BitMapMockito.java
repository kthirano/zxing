package com.google.zxing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.*;

public class BitMapMockito extends Assert{
  //@Mock
  @Spy
  private MockitoBinarizer bMock;
  //Binarizer bMock = Mockito.mock(Binarizer.class, CALLS_REAL_METHODS);
  @Mock
  private LuminanceSource lMock = mock(LuminanceSource.class);

  @Before
  public void setup(){
    bMock = new MockitoBinarizer(lMock);
    //bMock = new Binarizer();
    //bMock = bMock.createBinarizer(lMock);
    //when((bMock).getLuminanceSource()).thenReturn(lMock);
    //when((bMock).getHeight()).thenReturn(1);
    //when((bMock).getWidth()).thenReturn(2);

    //when((lMock).isCropSupported()).thenReturn(true);
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void BinaryBitmapMock() throws Exception{
    //when(bMock.getLuminanceSource()).thenReturn(lMock);
    //bMock = Mockito.mock(Binarizer.class, Mockito.CALLS_REAL_METHODS);
    //when(bMock.getHeight()).thenReturn(1);
    //when(bMock.getWidth()).thenReturn(2);
    when(lMock.isCropSupported()).thenReturn(true);
    //when(lMock.getWidth()).thenReturn(1);
    BinaryBitmap BBM = new BinaryBitmap(bMock);
    assertEquals(BBM.getWidth(), 0);
    //assertEquals(BBM.isCropSupported(), true);
    verify(bMock, times(1)).getWidth();
  }
}

