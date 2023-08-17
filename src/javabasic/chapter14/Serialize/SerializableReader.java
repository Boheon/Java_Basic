package javabasic.chapter14.Serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import static javabasic.chapter14.Serialize.Serializer.load;

public class SerializableReader {//역직렬화하여 복원된 필드 조사

    public static void main(String[] args) {
        try {
            ClassA v = (ClassA) Serializer.load("C:/temp/object.dat");
            System.out.println("field1 : " + v.field1);
            System.out.println("field2.field1 : " + v.field2.field1);
            System.out.println("field3 : " + v.field3);
            System.out.println("field4 : " + v.field4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
