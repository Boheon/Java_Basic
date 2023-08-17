package javabasic.chapter14;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

class TextFileFilter implements FilenameFilter {//.txt인지 판단

    @Override
    public boolean accept(File dir, String name) {
        System.out.println("필터링 : " + name);
        return name.endsWith(".txt");
    }
}

public class FileExample {
    public static void main(String[] args) throws URISyntaxException, IOException {
        File dir = new File("C:/Temp/Dir");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

        if (dir.exists() == false) {
            System.out.println(dir + " 존재하지 않음");
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            System.out.println(file1 + " 존재하지 않음");
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            System.out.println(file2 + " 존재하지 않음");
            file2.createNewFile();
        }
        if (file3.exists() == false) {
            System.out.println(file3 + " 존재하지 않음");
            file3.createNewFile();
        }

        File temp = new File("C:/Temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
        File[] contents = temp.listFiles(new TextFileFilter());

        System.out.println("날짜      시간      형태      크기      ");
        System.out.println("----------------------------------------");

        for (File file : contents) {
            System.out.println(sdf.format(new Date(file.lastModified())));//수정시간
            if (file.isDirectory()) {
                System.out.println("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }
}
