package pl.sdacademy.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sdacademy.dao.TestEntityDao;
import pl.sdacademy.entity.TestEntity;
import pl.sdacademy.utils.HibernateUtils;

import java.util.List;

public class TestEntityDaoImpl implements TestEntityDao {

    SessionFactory factory = HibernateUtils.getInstance().getFactory();
    Session session = factory.getCurrentSession();

    public void saveOrUpdate(TestEntity testEntity) {

        session.beginTransaction();
        session.saveOrUpdate(testEntity);
        session.getTransaction().commit();

        session.close();
    }

    public void delete(Long id) {

    }

    public TestEntity findById(Long id) {
        return null;
    }

    public List<TestEntity> findAll() {
        return null;
    }

    public TestEntity findByName(String name) {
        return null;
    }

    public List<TestEntity> findByValue(Integer minRange, Long maxRange) {
        return null;
    }

    /*public List<TestEntity> findByValue(Integer minRange, Long maxRange) {
        Session session = factory.getCurrentSession();
        List<TestEntity> result = session
                .createQuery("from TestEntity where value > :min and value < :max ")
                .setParameter("min", minRange)
                .setParameter("max", maxRange)
                .list();

        return result;
    }*/
}
