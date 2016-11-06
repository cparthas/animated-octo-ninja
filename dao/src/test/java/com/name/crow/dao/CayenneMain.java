package com.name.crow.dao;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

/**
 * Created by pchandramohan on 11/6/16.
 */
public class CayenneMain {

    public static void main(String[] args) {
        ServerRuntime cayenneRuntime = new ServerRuntime("cayenne-project.xml");
        ObjectContext context = cayenneRuntime.getContext();



    }
}
