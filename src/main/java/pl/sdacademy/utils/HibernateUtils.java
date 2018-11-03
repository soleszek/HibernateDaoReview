package pl.sdacademy.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
    private static HibernateUtils instance = new HibernateUtils();
    private SessionFactory factory;

    private HibernateUtils() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("Hibernate.xml")
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
                .getMetadataBuilder()
                .build();

        factory = metadata
                .getSessionFactoryBuilder()
                .build();
    }

    public static HibernateUtils getInstance() {
        return instance;
    }

    public SessionFactory getFactory() {
        return factory;
    }
}
