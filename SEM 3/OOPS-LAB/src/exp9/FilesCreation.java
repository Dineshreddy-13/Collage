package exp9;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
public class FilesCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String fileName = "hello"; 
        do {
            System.out.println("\nFile Operations Menu:\n1. Open File\n2. Create a New File\n3. Rename a File\n4. Delete a File\n5. Create a Directory\n6.Absolute Path of a File\n7. Get the File Names of a Directory\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1 ->  openFile(fileName);
                case 2 -> createFile(fileName);
                case 3 -> {
                    System.out.print("Enter new name for the file: ");
                    String newName = scanner.nextLine();
                    renameFile(fileName, newName);
                    fileName = newName; 
                }
                case 4 ->  deleteFile(fileName);
                case 5 -> {
                    System.out.print("Enter directory name to create: ");
                    String dirName = scanner.nextLine();
                    createDirectory(dirName);
                }
                case 6 -> findAbsolutePath(fileName);
                case 7 ->{
                    System.out.print("Enter directory to list files: ");
                    String directory = scanner.nextLine();
                    listFilesInDirectory(directory);
                }
                case 8 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 8);
        scanner.close();
    }
    private static void openFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            try {
                Desktop.getDesktop().open(file);
                System.out.println("File opened successfully.");
            } catch (IOException e) {
                System.out.println("Unable to open the file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
    private static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
    private static void renameFile(String oldName, String newName) {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Error renaming file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Error deleting file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
    private static void createDirectory(String dirName) {
        File directory = new File(dirName);
        if (directory.mkdirs()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Error creating directory or directory already exists.");
        }
    }

    private static void findAbsolutePath(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Absolute path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
    private static void listFilesInDirectory(String directory) {
        File dir = new File(directory);
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            if (files != null && files.length > 0) {
                System.out.println("Files in directory:");
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}

