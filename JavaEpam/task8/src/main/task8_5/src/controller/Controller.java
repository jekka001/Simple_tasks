package controller;

import inputSystem.InputSystem;
import view.View;
import workWithDirectory.FileRunTask;
import workWithDirectory.ViewFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void run(){
        String directory = InputSystem.directory(view);
        char letter = InputSystem.letter(view);
        String fileName = InputSystem.fileName(view);
        FileRunTask running = new FileRunTask( new File(directory), letter, fileName, view);
        Thread threadRunning = new Thread(running);
        threadRunning.start();
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            threadRunning.join();
            new ViewFile(fileName).run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
