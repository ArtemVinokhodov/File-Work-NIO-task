package fileWriteService;

import utils.FilePath;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {

    public String createFileAndWrite(String customFileName, String customContentText) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(FilePath.BASE_URL + customFileName + ".txt"));
            Files.writeString(newFile, customContentText);
            return newFile + " created!" + " Recorded in: " + FilePath.BASE_URL + customFileName;
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }
}
