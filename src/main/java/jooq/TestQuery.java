package jooq;

import jooq.cartrawler_dev_internal.dbo.tables.CarAgents;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.meta.jaxb.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestQuery {

    public static void main(String[] args) throws SQLException {
        DSLContext context = DSL.using(getConnection(), SQLDialect.SQLSERVER);
        context.select().from(CarAgents.CAR_AGENTS).limit(10).forEach(record -> {
            System.out.println(record.get(CarAgents.CAR_AGENTS.CAR_AGENT_NAME));
        });
    }

    private static Connection getConnection() throws SQLException {
        Jdbc jdbc = GenerateCode.getJDBC();
        return DriverManager.getConnection(jdbc.getUrl(), jdbc.getUser(), jdbc.getPassword());
    }
}
