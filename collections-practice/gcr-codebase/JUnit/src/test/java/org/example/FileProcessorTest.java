package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final String filename = "testfile.txt";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(filename));
    }

    @Test
    @DisplayName("Write and Read File Content Test")
    void testWriteAndReadFile() throws IOException {
        FileProcessor processor = new FileProcessor();
        processor.writeToFile(filename, "Hello JUnit");
        String content = processor.readFromFile(filename);
        assertEquals("Hello JUnit", content);
    }

    @Test
    @DisplayName("File Exists After Writing Test")
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor processor = new FileProcessor();
        processor.writeToFile(filename, "File Check");
        assertTrue(Files.exists(Path.of(filename)));
    }

    @Test
    @DisplayName("Read Non-Existing File Exception Test")
    void testReadFileNotExists() {
        FileProcessor processor = new FileProcessor();
        assertThrows(IOException.class, () -> processor.readFromFile("nofile.txt"));
    }
}
