package lankydan.tutorial.springboot.controller;

import lankydan.tutorial.springboot.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/person")
public class PersonRestController {

  @RequestMapping("/get")
  public PersonDTO getFromPersonController() {
    return new PersonDTO("Joe", "Blogs", new Date(), "Programmer", BigDecimal.ZERO);
  }

  @RequestMapping("/getPerson")
  public PersonDTO getPerson() {
    return new PersonDTO("Joe", "Blogs", new Date(), "Programmer", BigDecimal.ZERO);
  }
}
