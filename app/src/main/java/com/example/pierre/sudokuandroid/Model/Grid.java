package com.example.pierre.sudokuandroid.Model;

public class Grid {
    private String title;
    private Integer percent;

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Grid(String title, Integer percent) {
        this.title = title;
        this.percent = percent;
    }
}
