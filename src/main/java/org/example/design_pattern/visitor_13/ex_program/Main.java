package org.example.design_pattern.visitor_13.ex_program;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi",10000));
        binDir.add(new File("latex",20000));
        rootDir.accept(new ListVisitor());
        System.out.println();

        System.out.println("Making user entries...");
        Directory kim = new Directory("kim");
        Directory lee = new Directory("lee");
        Directory shin = new Directory("shin");
        usrDir.add(kim);
        usrDir.add(lee);
        usrDir.add(shin);
        kim.add(new File("diary.html", 100));
        kim.add(new File("Composite.html", 100));
        lee.add(new File("game.doc", 300));
        shin.add(new File("memo.tex", 400));
        shin.add(new File("junk.mail", 500));
        rootDir.accept(new ListVisitor());

        FileFindVisitor ffv = new FileFindVisitor(".html");
        rootDir.accept(ffv);
        System.out.println("HTML files are: ");
        for(File file : ffv.getFoundFiles()) {
            System.out.println(file.getName());
        }
    }
}
