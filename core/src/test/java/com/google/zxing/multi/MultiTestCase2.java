package com.google.zxing.multi;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.BufferedImageLuminanceSource;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.common.AbstractBlackBoxTestCase;
import com.google.zxing.common.HybridBinarizer;
import org.junit.Assert;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Path;

public class MultiTestCase2 extends Assert {

  @Test
  public void testByQuad1() throws Exception {
    Path testBase = AbstractBlackBoxTestCase.buildTestBase("src/test/resources/blackbox/multi-1");

    Path testImage = testBase.resolve("1.png");
    BufferedImage image = ImageIO.read(testImage.toFile());
    LuminanceSource source = new BufferedImageLuminanceSource(image);
    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

    ByQuadrantReader reader = new ByQuadrantReader(new MultiFormatReader());
    Result result = reader.decode(bitmap);
    assertNotNull(result);

    assertEquals("031415926531", result.getText());
    assertEquals(BarcodeFormat.UPC_A, result.getBarcodeFormat());

    reader.reset();
    result = reader.decode(bitmap);
    assertNotNull(result);

    assertEquals("031415926531", result.getText());
    assertEquals(BarcodeFormat.UPC_A, result.getBarcodeFormat());

  } /*
  @Test
  public void testByQuad2() throws Exception{
    Path testBase = AbstractBlackBoxTestCase.buildTestBase("src/test/resources/blackbox/multi-1");

    Path testImage = testBase.resolve("2.png");
    BufferedImage image = ImageIO.read(testImage.toFile());
    LuminanceSource source = new BufferedImageLuminanceSource(image);
    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

    ByQuadrantReader reader = new ByQuadrantReader(new MultiFormatReader());
    Result result = reader.decode(bitmap);
    assertNotNull(result);

    assertEquals("031415926531", result.getText());
    assertEquals(BarcodeFormat.UPC_A, result.getBarcodeFormat());

  }*/
  @Test
  public void testByQuad3() throws Exception {
    Path testBase = AbstractBlackBoxTestCase.buildTestBase("src/test/resources/blackbox/multi-1");

    Path testImage = testBase.resolve("3.png");
    BufferedImage image = ImageIO.read(testImage.toFile());
    LuminanceSource source = new BufferedImageLuminanceSource(image);
    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

    ByQuadrantReader reader = new ByQuadrantReader(new MultiFormatReader());
    Result result = reader.decode(bitmap);
    assertNotNull(result);

    assertEquals("031415926531", result.getText());
    assertEquals(BarcodeFormat.UPC_A, result.getBarcodeFormat());

  } /*
  @Test
  public void testByQuad4() throws Exception{
    Path testBase = AbstractBlackBoxTestCase.buildTestBase("src/test/resources/blackbox/multi-1");

    Path testImage = testBase.resolve("4.png");
    BufferedImage image = ImageIO.read(testImage.toFile());
    LuminanceSource source = new BufferedImageLuminanceSource(image);
    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

    ByQuadrantReader reader = new ByQuadrantReader(new MultiFormatReader());
    Result result = reader.decode(bitmap);
    assertNotNull(result);

    assertEquals("031415926531", result.getText());
    assertEquals(BarcodeFormat.UPC_A, result.getBarcodeFormat());

  }*/
}
