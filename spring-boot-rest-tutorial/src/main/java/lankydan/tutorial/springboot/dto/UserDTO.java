package lankydan.tutorial.springboot.dto;

/** Created by dankn on 07/04/2017. */
public class UserDTO {

  private String username;
  private String name;
  private String email;

  public UserDTO(final String username, final String name, final String email) {
    this.username = username;
    this.name = name;
    this.email = email;
  }

  public UserDTO() {}

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
