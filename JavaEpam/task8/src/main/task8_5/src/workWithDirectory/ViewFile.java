package workWithDirectory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ViewFile {
    private String fileName;

    public ViewFile(String fileName) {
        this.fileName = fileName;
    }

    public void run() throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while (reader.ready())
                System.out.println(reader.readLine());
            reader.close();
    }
}
