import fileReadServcie.FileReadService;
import fileWriteService.FileWriteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();
        FileReadService fileReadService = new FileReadService();


        System.out.println("Input: \n" +
                "'1' if you want read or \n" +
                "'2' if you want write file");
        String menu = scanner.nextLine();

        switch (menu) {
            case "1":
                System.out.println("Input name of file");
                String customFileNameForRead = scanner.nextLine();
                System.out.println("File is " + fileReadService.readFromFile(customFileNameForRead));
                break;
            case "2":
                System.out.println("Input name of file");
                String customFileName = scanner.nextLine();
                System.out.println("Input Text to file");
                String customContentText = scanner.nextLine();

                System.out.println(fileWriteService.createFileAndWrite(customFileName, customContentText));
                break;
            default:
                System.out.println("You inputted wrong number");
        }
    }
}
