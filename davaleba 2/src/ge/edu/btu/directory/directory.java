class directory {
    public static void main(String[] args) {
        class Main {
        }

            public void FounderFiles(String name, File file) {
                File[] list = file.listFiles();
                if (list != null)
                    for (File fil : list)

                    {
                        if (fil.isDirectory()) {
                            findFile(name, fil);
                        } else if (name.equalsIgnoreCase(fil.getName())) {
                            System.out.println(fil.getParentFile());
                        }
                    }
            }

            public static void main(String[] args) {

                Main ff = new Main();

                Scanner scan = new Scanner(System.in);

                System.out.println("შეიყვანეთ სიტყვა : ");

                String name = scan.next();
                ff.FounderFiles(name, new File("C:\\Users\\zvaxo\\OneDrive\\Desktop\\!!\\java1"));
            }
        }
    }