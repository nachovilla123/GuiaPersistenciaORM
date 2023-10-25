package ar.edu.utn.frba.dds.repositories;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericRepositoryJPA<T> implements ICrudRepository<T> {

    protected EntityManager entityManager;

    private Class<T> type;

    protected EntityTransaction entityTransaction;


    /** ------------------------ CONSTRUCTORS ------------------------ **/

    public GenericRepositoryJPA() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    /** ------------------------ METHODS ------------------------ **/

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void setEntityTransaction(EntityTransaction entityTransaction) {
        this.entityTransaction = entityTransaction;
    }

    public void setEntities(){
        EntityManager em = PerThreadEntityManagers.getEntityManager();
        this.setEntityManager(em);
        EntityTransaction tx = em.getTransaction();
        this.setEntityTransaction(tx);
    }

    

    @Override
    public void create(T t) {
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
    }

    @Override
    public T read(final Object id) {
        return (T) entityManager.find(type, id);
    }

    @Override
    public List<T> readAll() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = cb.createQuery(type);
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery.select(root);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public void update(final T t) {
        entityTransaction.begin();
        entityManager.merge(t);
        entityTransaction.commit();
    }

    @Override
    public void delete(final Object objeto) {
        entityTransaction.begin();
        entityManager.remove(entityManager.merge(objeto));
        entityTransaction.commit();
    }
}
