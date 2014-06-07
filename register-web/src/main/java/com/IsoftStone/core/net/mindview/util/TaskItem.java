//: net/mindview/util/TaskItem.java
// A Future and the Callable that produced it.
package com.IsoftStone.core.net.mindview.util;
import java.util.concurrent.*;

public class TaskItem<R,C extends Callable<R>> {
  public final Future<R> future;
  public final C task;
  public TaskItem(Future<R> future, C task) {
    this.future = future;
    this.task = task;
  }
} ///:~
