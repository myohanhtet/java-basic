package fairway.javabasic.IOTest;

import java.io.File;

public class CreateDir {

    public static void main(String[] args) {

        String dirname = "/home/myohanhtet/testdir";
        File d = new File(dirname);

        d.mkdirs();
    }


}
