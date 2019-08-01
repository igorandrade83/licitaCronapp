package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela RESPOSTA
 * @generated
 */
@Entity
@Table(name = "\"RESPOSTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Resposta")
public class Resposta implements Serializable {

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
  @Column(name = "conteudo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String conteudo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pergunta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pergunta pergunta;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_comissao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private comissao comissao;

  /**
   * Construtor
   * @generated
   */
  public Resposta(){
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
  public Resposta setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém conteudo
   * return conteudo
   * @generated
   */
  
  public java.lang.String getConteudo(){
    return this.conteudo;
  }

  /**
   * Define conteudo
   * @param conteudo conteudo
   * @generated
   */
  public Resposta setConteudo(java.lang.String conteudo){
    this.conteudo = conteudo;
    return this;
  }

  /**
   * Obtém pergunta
   * return pergunta
   * @generated
   */
  
  public Pergunta getPergunta(){
    return this.pergunta;
  }

  /**
   * Define pergunta
   * @param pergunta pergunta
   * @generated
   */
  public Resposta setPergunta(Pergunta pergunta){
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Obtém comissao
   * return comissao
   * @generated
   */
  
  public comissao getComissao(){
    return this.comissao;
  }

  /**
   * Define comissao
   * @param comissao comissao
   * @generated
   */
  public Resposta setComissao(comissao comissao){
    this.comissao = comissao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Resposta object = (Resposta)obj;
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
