package fileReadServcie;

import utils.FilePath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    public String readFromFile(String strPath) {
        try {
            return Files.readString(Path.of(FilePath.BASE_URL + strPath + ".txt"));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }
}
