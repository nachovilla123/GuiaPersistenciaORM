package ar.edu.utn.frba.dds.models.persistence;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


public class PersistentEntity {


  private Long id;


  public Long getId() {
    return this.id;
  }

  public void setId(Long id){
    this.id = id;
  }
}
