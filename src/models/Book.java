package models;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int anio;

    public Book(String title, String author, int anio) {
        this.title = title;
        this.author = author;
        this.anio = anio;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //Los libros deben estar **ordenados primero por título en orden descendente** y, en caso de empate, por año de publicación en orden ascendente. En caso de que dos libros tengan el mismo título y año, se considerarán duplicados y no deben incluirse en el resultado final.

    @Override
    public int compareTo(Book otro) {
        int titleComparison = otro.title.compareTo(this.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        if(this.anio == otro.anio) {
            return 0; 
        }
        return Integer.compare(this.anio, otro.anio);
    }
    

}
