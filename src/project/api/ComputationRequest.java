package project.api;

public class ComputationRequest {
    private final InputSource inputSource;
    private final OutputDestination outputDestination;
    private final char delimiter;

    public ComputationRequest(InputSource inputSource, OutputDestination outputDestination) {
        this(inputSource, outputDestination, ';');
    }

    public ComputationRequest(InputSource inputSource, OutputDestination outputDestination, char delimiter) {
        this.inputSource = inputSource;
        this.outputDestination = outputDestination;
        this.delimiter = delimiter;
    }

    public InputSource getInputSource() {
        return inputSource;
    }

    public OutputDestination getOutputDestination() {
        return outputDestination;
    }

    public char getDelimiter() {
        return delimiter;
    }
}
