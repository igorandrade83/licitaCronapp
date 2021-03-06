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
@Repository("cargoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface cargoDAO extends JpaRepository<cargo, java.lang.String> {

  /**
   * Obtém a instância de cargo utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM cargo entity WHERE entity.id = :id")
  public cargo findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de cargo utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM cargo entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM comissao entity WHERE entity.cargo.id = :id")
  public Page<comissao> findComissao(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.licitacao FROM comissao entity WHERE entity.cargo.id = :id")
  public Page<licitacao> listLicitacao(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM comissao entity WHERE entity.cargo.id = :instanceId AND entity.licitacao.id = :relationId")
  public int deleteLicitacao(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
