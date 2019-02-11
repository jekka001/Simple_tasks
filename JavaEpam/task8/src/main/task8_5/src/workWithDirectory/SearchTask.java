package workWithDirectory;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchTask implements Runnable {
    private BlockingQueue<File> que;
    private char letter;
    private String fileName;

    public SearchTask(BlockingQueue <File> que, char letter, String fileName) {
        this.que = que;
        this.letter = letter;
        this.fileName = fileName;
    }

    public void search(File ff) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream(ff));
        FileWriter fileWriter = new FileWriter(new File(fileName),true);
        String reg = "^" + Character.toUpperCase(letter) + "";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher;
        int count = 0;
        while(scanner.hasNext()){
            String str = scanner.next();
            matcher = pattern.matcher(str.toUpperCase());
            if(matcher.find()) {
                System.out.println(ff.getPath() + " -> " + str);
                count++;
            }
        }
        fileWriter.write(ff.getName() +" "+count+"\n");
        fileWriter.close();
        scanner.close();

    }

    public void run(){
        try{
            while(true){
                    File ff = que.take();
                    if (ff == FileRunTask.EXIT) {
                        break;
                    } else
                        search(ff);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
