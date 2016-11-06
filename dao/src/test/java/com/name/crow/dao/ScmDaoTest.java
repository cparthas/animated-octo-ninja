package com.name.crow.dao;


import org.apache.cayenne.access.DataContext;
import org.junit.Before;
import org.junit.Test;
import org.osjava.sj.loader.SJDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by pchandramohan on 11/6/16.
 */


public class ScmDaoTest {


    @Test
    public void testUsers() throws Exception {
        DataContext dataContext = new DataContext();



    }

    @Before
    public void setUp() throws Exception {

        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.osjava.sj.memory.MemoryContextFactory");
        System.setProperty("org.osjava.sj.jndi.shared", "true");

        DataSource ds  = new SJDataSource("org.apache.derby.jdbc.EmbeddedDriver","jdbc:derby:memory:testdb;create=true", "","",new Properties());
        Context ctx = new InitialContext();
        ctx.createSubcontext("java:comp/env");

        ctx.bind("jdbc/cbe", ds);


    }
}


