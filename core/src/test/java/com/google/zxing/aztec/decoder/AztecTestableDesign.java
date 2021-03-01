package com.google.zxing.aztec.decoder;

import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;

import org.junit.Test;
import org.junit.Assert;

public class AztecTestableDesign extends Assert {

  private static final ResultPoint[] NO_POINTS = new ResultPoint[0];

  @Test
  public void testCorrectBits(){
    BitMatrix matrix = BitMatrix.parse(
      "X X X X X     X X X       X X X     X X X     \n" +
        "X X X     X X X     X X X X     X X X     X X \n" +
        "  X   X X       X   X   X X X X     X     X X \n" +
        "  X   X X     X X     X     X   X       X   X \n" +
        "  X X   X X         X               X X     X \n" +
        "  X X   X X X X X X X X X X X X X X X     X   \n" +
        "  X X X X X                       X   X X X   \n" +
        "  X   X   X   X X X X X X X X X   X X X   X X \n" +
        "  X   X X X   X               X   X X       X \n" +
        "  X X   X X   X   X X X X X   X   X X X X   X \n" +
        "  X X   X X   X   X       X   X   X   X X X   \n" +
        "  X   X   X   X   X   X   X   X   X   X   X   \n" +
        "  X X X   X   X   X       X   X   X X   X X   \n" +
        "  X X X X X   X   X X X X X   X   X X X   X X \n" +
        "X X   X X X   X               X   X   X X   X \n" +
        "  X       X   X X X X X X X X X   X   X     X \n" +
        "  X X   X X                       X X   X X   \n" +
        "  X X X   X X X X X X X X X X X X X X   X X   \n" +
        "X     X     X     X X   X X               X X \n" +
        "X   X X X X X   X X X X X     X   X   X     X \n" +
        "X X X   X X X X           X X X       X     X \n" +
        "X X     X X X     X X X X     X X X     X X   \n" +
        "    X X X     X X X       X X X     X X X X   \n",
      "X ", "  ");
    AztecDetectorResult r = new AztecDetectorResult(matrix, NO_POINTS, false, 30, 2);
    Decoder d = new Decoder();
    boolean[] b = d.testExtractBits(r, r.getBits());
    boolean[] actual = {
      true, true, true, true, false, true, false, true, false, true, false, true, false, true, false, true,
      false, true, false, true, false, true, false, true, false, true, true, true, false, true, false, true,
      false, true, true, false, true, false, true, true, false, true, false, true, true, false, true, false,
      true, true, false, true, false, true, true, false, true, false, true, true, false, true, false, true,
      true, false, true, false, true, true, false, true, false, true, true, false, true, false, true, true,
      false, true, false, true, true, false, true, false, true, true, false, true, false, true, true, false,
      true, false, true, true, false, true, false, true, true, false, true, false, true, true, false, true,
      false, true, true, false, true, false, true, true, false, true, false, true, true, false, true, false,
      true, true, false, true, false, true, true, false, true, false, true, true, false, true, false, true,
      true, false, true, false, true, true, false, true, false, true, true, false, true, false, true, true,
      false, true, false, true, true, false, true, false, true, true, false, true, false, true, true, false,
      true, false, true, true, true, true, false, true, false, false, true, false, true, true, false, true,
      true, true, false, true, true, true, true, true, true, true, true, false, false, true, false, true,
      false, true, false, true, true, false, true, false, true, true, false, false, false, true, false, false,
      false, true, false, true, false, false, true, false, true, false, false, true, true, true, false, true,
      true, false, true, true, true, true, false, false, false, true, true, true, false, false, false, true,
      false, true, false, false, true, false, false, false, false, true, true, false, true, true, true, false,
      true, false, true, false, false, false, true, true, false, true, false, false, false, false, true, true};
    assertArrayEquals(b, actual);
  }

  @Test
  public void testCorrectBits2(){
    BitMatrix matrix = BitMatrix.parse(
      "      X     X X X   X           X     \n" +
        "    X X   X X   X X X X X X X   X     \n" +
        "    X X                         X   X \n" +
        "  X X X X X X X X X X X X X X X X X   \n" +
        "      X                       X       \n" +
        "      X   X X X X X X X X X   X   X   \n" +
        "  X X X   X               X   X X X   \n" +
        "  X   X   X   X X X X X   X   X X X   \n" +
        "      X   X   X       X   X   X X X   \n" +
        "  X   X   X   X   X   X   X   X   X   \n" +
        "X   X X   X   X       X   X   X     X \n" +
        "  X X X   X   X X X X X   X   X X     \n" +
        "      X   X               X   X X   X \n" +
        "      X   X X X X X X X X X   X   X X \n" +
        "  X   X                       X       \n" +
        "X X   X X X X X X X X X X X X X X X   \n" +
        "X X     X   X         X X X       X X \n" +
        "  X   X   X   X X X X X     X X   X   \n" +
        "X     X       X X   X X X       X     \n",
      "X ", "  ");
    AztecDetectorResult r = new AztecDetectorResult(matrix, NO_POINTS, false, 30, 2);
    Decoder d = new Decoder();
    boolean[] b = d.testExtractBits(r, r.getBits());
    boolean[] actual = {
      false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, true,
      false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, true, false,
      true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, true, true, false, false, false, true, false, true, false, true, true, true, false, true,
      true, true, true, false, true, true, false, true, false, false, true, true, false, true, true, true, true,
      true, false, true, false, true, true, true, false, true, false, true, false, true, true, true, false, true,
      false, true, false, true, false, true, false, false, false, true, false, true, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
      true, false, false, true, true, true, false, true, false, true, false, true, false, true, false, true, false,
      true, false, true, false, true, false, true, false, true, false, true,};
    assertArrayEquals(b,actual);
  }


}
