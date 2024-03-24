package vin.lucas.hellospring.presentation.http.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vin.lucas.hellospring.domain.greeting.entity.Greeting;
import vin.lucas.hellospring.domain.greeting.repository.DatabaseRepository;

import java.util.List;

@RestController
public final class GreetingController {
    private final DatabaseRepository databaseRepository;

    public GreetingController(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @ResponseBody
    @GetMapping("/greetings")
    public List<Greeting> index() {
        return databaseRepository.findAll();
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/greetings", method = RequestMethod.POST)
    public String store(@RequestBody Greeting greeting) {
        databaseRepository.save(greeting);

        return "Greeting stored with id " + greeting.getId();
    }
}
