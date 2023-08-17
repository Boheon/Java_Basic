package javabasic.chapter14.Serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import static javabasic.chapter14.Serialize.Serializer.save;

public class SerializableWriter {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;

        try {
            Serializer.save("C:/temp/object.dat", classA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
