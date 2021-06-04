package search;

import java.time.LocalDateTime;

public class Word {
    private int lineNumbers;
    private String word;
    private int thread;
    private LocalDateTime time;

    public Word(int lineNumbers, String word, int thread, LocalDateTime time) {
        this.lineNumbers = lineNumbers;
        this.word = word;
        this.thread = thread;
        this.time = time;
    }

    public String getLineNumbers() {
        return Integer.toString(lineNumbers);
    }

    public String getWord() {
        return word;
    }

    public String getThread() {
        return Integer.toString(thread);
    }

    public String getTime() {
        return time.toString();
    }

    @Override
    public String toString() {
        return "Word{" +
                "lineNumbers=" + lineNumbers +
                ", word='" + word + '\'' +
                ", thread=" + thread +
                ", time=" + time +
                '}';
    }
}
