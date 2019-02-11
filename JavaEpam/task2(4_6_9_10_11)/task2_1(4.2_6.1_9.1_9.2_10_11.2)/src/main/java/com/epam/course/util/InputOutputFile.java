package com.epam.course.util;

import com.epam.course.model.Data.DataSource;
import com.epam.course.model.Entity.Book;
import org.apache.log4j.Logger;
import java.io.*;

public class InputOutputFile {
    final static Logger logger = Logger.getLogger(InputOutputFile.class);
    private static File file = new File(".\\src\\main\\resources\\data.ser");

    public static Book[] load() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Book[]) inputStream.readObject();
        } catch (FileNotFoundException e) {
            logger.info("File not found!");
            return DataSource.getBooks();
        } catch (IOException | ClassNotFoundException e) {
            logger.error("Error read");
            return new Book[0];
        }
    }

    public static void save(Book[] books){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(books);
        } catch (FileNotFoundException e) {
            logger.info("File not found");
        } catch (IOException e) {
            logger.error("Error write");
        }
    }
}
