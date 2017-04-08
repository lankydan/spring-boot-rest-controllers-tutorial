package lankydan.tutorial.springboot.controller;

import lankydan.tutorial.springboot.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

  @RequestMapping("/get")
  public UserDTO getFromUserController() {
    return new UserDTO("joeblogs", "Joe Blogs", "joeblogs@gmail.co.uk");
  }

  @RequestMapping("/getUser")
  public UserDTO getUser() {
    return new UserDTO("joeblogs", "Joe Blogs", "joeblogs@gmail.co.uk");
  }
}
