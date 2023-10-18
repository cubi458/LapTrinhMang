package LapTrinhMang.lab2;
import java.io.File;

public class DirectoryTree {

    public static void main (String args[]) {
        displayIt(new File("D:\\Bi\\Phim\\Cowboy Bebop"));
    }

    public static void displayIt(File node){

        if(node.isDirectory()){
            String[] subNote = node.list();
            long totalSize = 0;

            for(String filename : subNote){
                File subNode = new File(node, filename);
                if (subNode.isFile()) {
                    totalSize += subNode.length();
                }
            }

            System.out.println(" - " + node.getName() + " (" + formatSize(totalSize) + ")");

            for(String filename : subNote){
                File subNode = new File(node, filename);
                if (subNode.isDirectory()) {
                    displayIt(subNode);
                } else {
                    System.out.println("   --- " + subNode.getName() + " (" + formatSize(subNode.length()) + ")");
                }
            }
        }
    }

    public static String formatSize(long size) {
        if (size < 1024) {
            return size + " B";
        } else if (size < 1024 * 1024) {
            return size / 1024 + " KB";
        } else if (size < 1024 * 1024 * 1024) {
            return size / (1024 * 1024) + " MB";
        } else {
            return size / (1024 * 1024 * 1024) + " GB";
        }
    }
}
