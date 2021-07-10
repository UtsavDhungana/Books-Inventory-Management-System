/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.appliancesInfo;

/**
 *
 * @author utsav
 */
public class TableInfo {
    String bookId;
    String genre;
    String bookName;
    String priceRange;
    int price;
    String author;

    public TableInfo(String bookId, String genre, String bookName, String priceRange, int price, String author) {
        this.bookId = bookId;
        this.genre = genre;
        this.bookName = bookName;
        this.priceRange = priceRange;
        this.price = price;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getGenre() {
        return genre;
    }

    public String getBookName() {
        return bookName;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
        
}
