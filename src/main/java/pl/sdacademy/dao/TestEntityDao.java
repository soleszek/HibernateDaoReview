package pl.sdacademy.dao;

import pl.sdacademy.entity.TestEntity;

import java.util.List;

public interface TestEntityDao {
    void saveOrUpdate(TestEntity testEntity);
    void delete(Long id);
    TestEntity findById(Long id);
    List<TestEntity> findAll();

    TestEntity findByName(String name);
    List<TestEntity> findByValue (Integer minRange, Long maxRange);
}
