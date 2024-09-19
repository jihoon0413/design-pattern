package org.example.design_pattern.abstract_factory_8.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output(String filename) {
        try {
            Files.writeString(Path.of(filename), makeHTML(),
                    StandardOpenOption.CREATE,  // 존재하지 않으면 새로 만든다.
                    StandardOpenOption.TRUNCATE_EXISTING,   // 존재하면 크기를 일단 0으로 한다.
                    StandardOpenOption.WRITE);  // 기록한다.
            System.out.println(filename + " 파일을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
