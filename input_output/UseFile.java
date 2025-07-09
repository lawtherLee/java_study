package input_output;

import java.io.File;

public class UseFile {
    public static void main(String[] args) {
        File f = new File("/export/home/d.java");

        System.out.println(f.exists() ? "File exists" : "File does not exist");
        System.out.println(f.canRead() ? "File can be read" : "File cannot be read");
        System.out.println(f.canWrite() ? "File can be written" : "File cannot be written");
        System.out.println(f.isFile() ? "File is a file" : "File is not a file");
        System.out.println(f.isDirectory() ? "File is a directory" : "File is not a directory");
        System.out.println(f.isAbsolute() ? "File is an absolute path" : "File is not an absolute path");
        System.out.println("The file is named " + f.getName());
        System.out.println("The file is path " + f.getPath());
        System.out.println("The file is parent " + f.getParent());
        System.out.println("The file is absolute path " + f.getAbsolutePath());
        System.out.println("The file is last modified " + f.lastModified());
        System.out.println("The file is length " + f.length());

        File newFile = new File("newFile");
        f.renameTo(newFile);

        System.out.println("\tRename the file to: " + newFile.getName());
        System.out.println(f.exists() ? "File exists" : "File does not exist");
        newFile.delete();
        System.out.println("\tDelete the file " + newFile + ".....");
        System.out.println(f.exists() ? "File exists" : "File does not exist");
    }
}
