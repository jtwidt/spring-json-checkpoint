package com.galvanize.jsoncheckpoint;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {

    private String title;
    private int minutes;
    private String genre;
    private double rating;
    private int metascore;
    private String description;
    private int votes;
    private double gross;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Credits")
    private List<Credit> credits;

    @JsonGetter("Metascore")
    public int getMetascore() {
        return metascore;
    }

    @JsonSetter("metascore")
    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    @JsonGetter("Title")
    public String getTitle() {
        return title;
    }

    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter("Minutes")
    public int getMinutes() {
        return minutes;
    }

    @JsonSetter("minutes")
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @JsonGetter("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonSetter("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonGetter("Rating")
    public double getRating() {
        return rating;
    }

    @JsonSetter("rating")
    public void setRating(double rating) {
        this.rating = rating;
    }

    @JsonGetter("Description")
    public String getDescription() {
        return description;
    }

    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter("Votes")
    public int getVotes() {
        return votes;
    }

    @JsonSetter("votes")
    public void setVotes(int votes) {
        this.votes = votes;
    }

    @JsonGetter("Gross")
    public double getGross() {
        return gross;
    }

    @JsonSetter("gross")
    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Credit {
        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        @JsonProperty("Person")
        private Person person;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Person {

        private String role;

        @JsonProperty("FirstName")
        private String firstName;

        @JsonProperty("LastName")
        private String lastName;

        @JsonGetter("Role")
        public String getRole() {
            return role;
        }

        @JsonSetter("role")
        public void setRole(String role) {
            this.role = role;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
