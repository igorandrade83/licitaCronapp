package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARGO
 * @generated
 */
@Entity
@Table(name = "\"CARGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.cargo")
public class cargo implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "tipoCargo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipoCargo;

  /**
   * Construtor
   * @generated
   */
  public cargo(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public cargo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tipoCargo
   * return tipoCargo
   * @generated
   */
  
  public java.lang.String getTipoCargo(){
    return this.tipoCargo;
  }

  /**
   * Define tipoCargo
   * @param tipoCargo tipoCargo
   * @generated
   */
  public cargo setTipoCargo(java.lang.String tipoCargo){
    this.tipoCargo = tipoCargo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cargo object = (cargo)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
