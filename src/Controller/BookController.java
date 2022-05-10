package Controller;

import Model.Book;
import View.BookView;

public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view){
        this.model = model;
        this.view = view;
    }

    public void setBookName(String name){
        model.setName(name);
    }
    public String getBookName(){
        return model.getName();
    }
    public long getBookId(){
        return model.getId();
    }
    public void updateView(){
        view.printBookDetails(model.getName());
    }
}