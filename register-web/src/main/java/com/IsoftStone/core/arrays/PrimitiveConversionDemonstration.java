package com.IsoftStone.core.arrays;//: arrays/PrimitiveConversionDemonstration.java
import java.util.*;

import com.IsoftStone.core.net.mindview.util.ConvertTo;
import com.IsoftStone.core.net.mindview.util.CountingGenerator;
import com.IsoftStone.core.net.mindview.util.Generated;

public class PrimitiveConversionDemonstration {
  public static void main(String[] args) {
    Integer[] a = Generated.array(Integer.class,
            new CountingGenerator.Integer(), 15);
    int[] b = ConvertTo.primitive(a);
    System.out.println(Arrays.toString(b));
    boolean[] c = ConvertTo.primitive(
      Generated.array(Boolean.class,
        new CountingGenerator.Boolean(), 7));
    System.out.println(Arrays.toString(c));
  }
} /* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
[true, false, true, false, true, false, true]
*///:~
