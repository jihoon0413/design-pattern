package org.example.design_pattern._15_facade;

import org.example.design_pattern._15_facade.pageMaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("absjkdfjk@example.com", "welcome.html");
        PageMaker.makeLinkPage("linkpage.html");
    }
}
