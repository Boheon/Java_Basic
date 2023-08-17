package javabasic.chapter14.Serialize;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    static int field3;
    transient int field4;//직렬화 하지 않겠다
}
