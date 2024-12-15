package org.example.design_pattern.visitor_13.ex_program;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor{

    String fileType;
    List<File> foundFiles = new ArrayList<>();

    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    public Iterable<File> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public void visit(File file) {
        if(file.getName().endsWith(fileType)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for(Entry entry : directory) {
            entry.accept(this);
        }
    }
}
