
public class Main {
    public static void main(String[] args) {
        TaskNumber taskNumber = new TaskNumber();
        taskNumber.printNumberTask("13.1.1");
        taskOne();

        taskNumber.printNumberTask("13.1.2");
        taskTwo();

    }

    static void taskOne() {
        WordProcessor wordProcessor = new WordProcessor();
        wordProcessor.howManyWords();
    }

    static void taskTwo() {

        new CodeCaesarCipher().codeShifr();
    }
}