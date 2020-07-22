package com.galvanize.jsoncheckpoint;

import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JSONController {

    @GetMapping("/movies/movie")
    public Movie getMovie() {
        Movie godfather = new Movie();
        Movie.Person copolla = new Movie.Person();
        Movie.Person brando = new Movie.Person();
        Movie.Person pacino = new Movie.Person();
        Movie.Person caan = new Movie.Person();
        Movie.Person keaton = new Movie.Person();
        Movie.Credit copollaCredit = new Movie.Credit();
        Movie.Credit brandoCredit = new Movie.Credit();
        Movie.Credit pacinoCredit = new Movie.Credit();
        Movie.Credit caanCredit = new Movie.Credit();
        Movie.Credit keatonCredit = new Movie.Credit();

        copolla.setFirstName("Francis Ford");
        copolla.setLastName("Copolla");
        copolla.setRole("Director");
        copollaCredit.setPerson(copolla);

        brando.setFirstName("Marlon");
        brando.setLastName("Brando");
        brando.setRole("Star");
        brandoCredit.setPerson(brando);

        pacino.setFirstName("Al");
        pacino.setLastName("Pacino");
        pacino.setRole("Star");
        pacinoCredit.setPerson(pacino);

        caan.setFirstName("James");
        caan.setLastName("Caan");
        caan.setRole("Star");
        caanCredit.setPerson(caan);

        keaton.setFirstName("Diane");
        keaton.setLastName("Keaton");
        keaton.setRole("Star");
        keatonCredit.setPerson(keaton);

        godfather.setTitle("The Godfather");
        godfather.setMinutes(175);
        godfather.setGenre("Crime, Drama");
        godfather.setRating(9.2);
        godfather.setMetascore(100);
        godfather.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        godfather.setVotes(1561591);
        godfather.setGross(134.97);
        godfather.setYear("1972");
        godfather.setCredits(Arrays.asList(copollaCredit, brandoCredit, pacinoCredit, caanCredit, keatonCredit));

        return godfather;
    }

    @PostMapping("/movies/gross/total")
    public Map<String, Double> getTotal(@RequestBody List<Movie> movies) {
        Map<String, Double> result = new HashMap<String, Double>();
        DecimalFormat df = new DecimalFormat("#.##");

        double sum = 0;

        for (Movie movie : movies) sum += movie.getGross();

        result.put("result", Double.valueOf(df.format(sum)));

        return result;
    }

}
