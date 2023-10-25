package ar.edu.utn.frba.dds.models.users;

import java.time.LocalDateTime;

import ar.edu.utn.frba.dds.converters.PasswordConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name")
  protected String name;

  @Convert(converter = PasswordConverter.class)
  @Column(name = "password")
  protected String password;

  @Column(name = "lastLoginAttempt")
  protected LocalDateTime lastLoginAttempt;

  public User(String name, String password){
    this.name = name;
    this.password = password;
  }
  public User(){

  }




}
