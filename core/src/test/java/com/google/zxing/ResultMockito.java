package com.google.zxing;

import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class ResultMockito {
  @Mock
  ResultPoint resultMock = mock(ResultPoint.class);

  @Mock
  ResultPoint resultMock2 = mock(ResultPoint.class);

  @Test
  public void ResultPoint(){

    ResultPoint[] rpArray = new ResultPoint[]{resultMock};
    ResultPoint[] rpArray2 = new ResultPoint[]{resultMock2};
    String testString = "test";
    Result resultTest = new Result(testString, testString.getBytes(), rpArray, BarcodeFormat.AZTEC);
    resultTest.addResultPoints(rpArray2);
    verify(resultMock, times(1));

  }

}
