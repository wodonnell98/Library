package com.softwareinstitute.libraryVolTwo.odonnell;

public class NonBorrowable extends NonFiction{

    private int publishedYear;
    private String publisher;
    private String scope;

//////////////////////////////////////////////////////////////////////////////////



    public NonBorrowable(int publishedYear, String publisher, String scope){
        super("Non-Borrowable", "Reference Book");
        this.publishedYear = publishedYear;
        this.publisher = publisher;
        this.scope = scope;
    }

////////////////////////////////////////////////////////////


    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
