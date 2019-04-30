package config;

import com.github.springtestdbunit.operation.DefaultDatabaseOperationLookup;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.File;
import java.net.MalformedURLException;
import java.sql.SQLException;

import static com.github.springtestdbunit.annotation.DatabaseOperation.CLEAN_INSERT;

@Component("dbUnit")
public class DBUnit {
    @Bean("dataSource")
    public DataSource dbUnitDatabaseConnection() {
        final SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/selenium_exemplo?useSSL=false&nullCatalogMeansCurrent=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }

    public void cleanInsert(final String dataset) throws MalformedURLException,
                                                         DatabaseUnitException, SQLException {
        final FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
        builder.setColumnSensing(true);

        final IDataSet dataSet = builder.build(new File(String.format("src/test/java/datasets/%s", dataset)));
        final DatabaseConnection databaseConnection = new DatabaseConnection(dbUnitDatabaseConnection().getConnection());

        new DefaultDatabaseOperationLookup().get(CLEAN_INSERT).execute(databaseConnection, dataSet);
    }
}
