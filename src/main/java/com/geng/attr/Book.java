package com.geng.attr;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class Book {

    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void showName() {
        System.out.println("book: "+ bookName);
    }
}
