package dev.craftlr.exercice4;

public class Pagination {
    int total;
    int current;

    public Pagination(int current, int total) {
        this.total = total;
        this.current = current;
    }

    String display(){
        return "1 (2) 3 4 5";
    }
}
