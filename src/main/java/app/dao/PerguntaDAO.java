package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PerguntaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PerguntaDAO extends JpaRepository<Pergunta, java.lang.String> {

  /**
   * Obtém a instância de Pergunta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pergunta entity WHERE entity.id = :id")
  public Pergunta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pergunta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pergunta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Resposta entity WHERE entity.pergunta.id = :id")
  public Page<Resposta> findResposta(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.comissao FROM Resposta entity WHERE entity.pergunta.id = :id")
  public Page<comissao> listComissao(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Resposta entity WHERE entity.pergunta.id = :instanceId AND entity.comissao.id = :relationId")
  public int deleteComissao(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key licitacao
   * @generated
   */
  @Query("SELECT entity FROM Pergunta entity WHERE entity.licitacao.id = :id")
  public Page<Pergunta> findPerguntasByLicitacao(@Param(value="id") java.lang.String id, Pageable pageable);

}
