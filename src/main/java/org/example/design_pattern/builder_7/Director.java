package org.example.design_pattern.builder_7;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{"How are you?","Hello","Hi"});
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{"Good morning", "Good afternoon", "Good evening"});
        builder.close();
    }

    public void construct2() {
        builder.makeTitle("백엔드 개발자 되기");
        builder.makeString("기초 다지기");
        builder.makeItems(new String[] {"알고리즘 공부", "네트워크 공부", "디자인패턴 공부"});
        builder.makeString("자격증 따기");
        builder.makeItems(new String[] {"SQLD", "정보처리기사"});
        builder.close();
    }

}
