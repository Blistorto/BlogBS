package br.com.blog.model.connection;

import br.com.blog.model.connection.DBConnection;
import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

public class ConnectionTest {

    private final EntityManager entityManager;

    public ConnectionTest() {
        entityManager = DBConnection.newInstance().getEntityManager();
    }

    @Test
    public void hasValidConnection() {
        Assert.assertNotNull(entityManager);
        Assert.assertTrue(entityManager.isOpen());
    }
}
