package dav1;

import java.io.File;
import java.io.FilenameFilter;

public class Filecounter {

    public static void main(String[] args) {

        Integer sumOfResults = 0;
        File file = new File("C:\\Users\\zvaxo\\OneDrive\\Desktop\\ERROR 404!!!\\BTU_DOCUMENTS");

        for (File singleFile : file.listFiles()) {
            if (singleFile.getName().toLowerCase().startsWith("btu"))
                sumOfResults++;
        }

        System.out.println(sumOfResults);
    }

}
