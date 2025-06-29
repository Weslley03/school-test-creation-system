package com.weftecnologia.school_test_creation_system.util;

import java.util.Random;

public class IdGeneratorUtil {

  private static final Random random = new Random();

  public static int generateId() {
    long timeStamp = System.currentTimeMillis();
    int randomSuffix = random.nextInt(1000);
    return (int) (timeStamp & Integer.MAX_VALUE) + randomSuffix;
  }
}
