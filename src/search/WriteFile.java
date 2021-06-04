package search;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

public class WriteFile {
    private String path;
    private boolean aof = false;

    public WriteFile(String path) {
        this.path = path;
    }

    public WriteFile(String path, boolean aof) {
        this.path = path;
        this.aof = aof;
    }

    public void writeFile(List<Word> words, String totalTime) throws IOException {

        FileWriter writer = new FileWriter(this.path, this.aof);
        PrintWriter printer = new PrintWriter(writer);

        String now = LocalDateTime.now().toString();

        for (Word word : words) {
            printer.printf("Thread=%s - Line= %s, Word= %s, Find:[%s], Print:[%s],%n",
                    word.getLineNumbers(), word.getThread(), word.getWord(), word.getTime(), now);
        }

        printer.close();
    }
}
