package ge.edu.btu.Finder;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File folder = new File ("C:\\\\Users\\\\vakhzanga0\\\\Desktop\\\\რესურსები\\\\რესურსები\\\\BTU_DOCUMENT\");
                File []File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles){
            if (file.isFile()); {
                System.out.println(file.getName());
            }
        }
        class main extends Thread {
            Scanner scanner = new Scanner(System.in);
            @Override
            public void run() {
                while (true) {
                    System.out.println("ჩაწერეთ სიტყვა : ");
                    String find = scanner.nextLine();
                    FilenameFilter contains = (directory, filename) -> filename.contains(find);
                    File location;
                    File[] files = location.listFiles(contains);
                    assert files != null;
                    for (File f : files) {
                        System.out.println("მოძებნე" + f);

                    }
                }
            }

        }
    }
}
