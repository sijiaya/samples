package com.soft1841.week6;

public class MovieApp {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("无名之辈","39"),
                new Movie("神奇动物","30")
        };
        for (Movie movie:movies) {
            System.out.println(movie);
        }
    }
}
class Movie{
    private String name;
    private String ticket;
    public Movie() {
    }

    public Movie(String name, String ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "电影名称:"+ name+ "   票价:"+ ticket;
    }
}