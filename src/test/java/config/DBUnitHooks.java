package config;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.dbunit.DatabaseUnitException;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.sql.SQLException;

public class DBUnitHooks {
    @Autowired
    private DBUnit dbUnit;

    @Before("@DatabaseSetup(\"")
    public void before(final Scenario s) throws DatabaseUnitException, SQLException, MalformedURLException {
        for (String param: s.getSourceTagNames()) {
            if(param.endsWith("\")")) {
                final String dataset = param.substring(1, param.length() - 2);
                dbUnit.cleanInsert(dataset);
            }
        }
    }
}
