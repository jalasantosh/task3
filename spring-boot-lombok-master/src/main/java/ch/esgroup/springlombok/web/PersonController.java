package ch.esgroup.springlombok.web;

import ch.esgroup.springlombok.model.PersonDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

  private PersonDTO personDTO = new PersonDTO("not-defined", 0);

  @PostMapping
  public void create(@RequestBody PersonDTO request) {
    personDTO = request;
  }

  @GetMapping
  public PersonDTO find() {
    return personDTO;
  }

}
