package workWithDirectory;

import view.View;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileRunTask implements Runnable{
    private File startDir;
    private char letter;
    private String fileName;
    private View view;
    public static final File EXIT = new File("");

    public FileRunTask(File startDir, char letter, String fileName, View view) {
        this.startDir = startDir;
        this.letter = letter;
        this.fileName = fileName;
        this.view = view;
    }

    public void run(){
        try {
                runDir(startDir);
        } catch (InterruptedException e) { }
    }

    public void runDir(File dir) throws InterruptedException {
        BlockingQueue<File> que = new ArrayBlockingQueue<File>(300);
        File[] files = dir.listFiles();
        for(File ff : files)
            if(ff.isDirectory()) {
                runDir(ff);
            }else {
                que.put(ff);
                view.printMessage(view.PROCESSING);
            }
        que.put(EXIT);
        Thread thread = new Thread(new SearchTask(que,letter,fileName));
        thread.start();
        view.printMessage(thread.getName());
        thread.join();
    }
}
