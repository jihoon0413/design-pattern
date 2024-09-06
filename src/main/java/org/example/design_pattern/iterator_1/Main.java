package org.example.design_pattern.iterator_1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator<Book> it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();       // 사실상 아래 for 문을 이용한 방법에 내부적으로 이 코드가 진행됨

        for (Book book : bookShelf) { //bookShelf 는 Iterable 를 통해 무엇을 반복할지 정의 했기 때문에 이렇게 쓸 수 있는 것 같음
            System.out.println(book.getName());
        }


    }
}
