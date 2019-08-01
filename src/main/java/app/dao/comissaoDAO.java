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
@Repository("comissaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface comissaoDAO extends JpaRepository<comissao, java.lang.String> {

  /**
   * Obtém a instância de comissao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM comissao entity WHERE entity.id = :id")
  public comissao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de comissao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM comissao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Resposta entity WHERE entity.comissao.id = :id")
  public Page<Resposta> findResposta(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pergunta FROM Resposta entity WHERE entity.comissao.id = :id")
  public Page<Pergunta> listPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Resposta entity WHERE entity.comissao.id = :instanceId AND entity.pergunta.id = :relationId")
  public int deletePergunta(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key cargo
   * @generated
   */
  @Query("SELECT entity FROM comissao entity WHERE entity.cargo.id = :id")
  public Page<comissao> findcomissaosByCargo(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key licitacao
   * @generated
   */
  @Query("SELECT entity FROM comissao entity WHERE entity.licitacao.id = :id")
  public Page<comissao> findcomissaosByLicitacao(@Param(value="id") java.lang.String id, Pageable pageable);

}
