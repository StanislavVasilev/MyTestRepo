package com.test.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {
  @Test
  public void areaRectangle(){
    Rectangle r = new Rectangle(5.0, 7);
    Assert.assertEquals(r.area(), 35.0);
  }
}
