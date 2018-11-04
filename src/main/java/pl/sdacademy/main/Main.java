package pl.sdacademy.main;

import pl.sdacademy.dao.TestEntityDao;
import pl.sdacademy.entity.TestEntity;
import pl.sdacademy.hibernate.dao.TestEntityDaoImpl;
import pl.sdacademy.utils.HibernateUtils;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TestEntityDao testEntityDao = new TestEntityDaoImpl();

        TestEntity test = new TestEntity();
        test.setName(UUID.randomUUID().toString());
        test.setValue((int)(Math.random() * 100));

        testEntityDao.saveOrUpdate(test);

        HibernateUtils.getInstance().getFactory().close();
    }
}
