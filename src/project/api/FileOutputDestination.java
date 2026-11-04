package project.api;

public class FileOutputDestination implements OutputDestination {
    private final String filePath;

    public FileOutputDestination(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;   
    }
}
