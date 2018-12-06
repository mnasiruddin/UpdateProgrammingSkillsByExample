package jooq;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

public class GenerateCode {

    public static void main(String[] args) throws Exception {

        Configuration configuration = new Configuration()
                .withJdbc(getJDBC())
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.sqlserver.SQLServerDatabase")
                                .withIncludes("Cartrawler_dev_internal.*")
                                .withExcludes("UNUSED_TABLE|PREFIX_.*|SECRET_SCHEMA\\.SECRET_TABLE|SECRET_ROUTINE")
                                )
                        .withTarget(new Target()
                                .withPackageName("jooq")
                                .withDirectory("/Users/mnasiruddin/Documents/Personal Development/LearnJavaingByExample/src/main/java/jooq")));
        GenerationTool.generate(configuration);
    }

    public static Jdbc getJDBC() {
        return new Jdbc()
                .withDriver("net.sourceforge.jtds.jdbc.Driver")
                .withUrl("jdbc:jtds:sqlserver://192.168.100.22:1433/Cartrawler_dev_internal")
                .withUser("ota")
                .withPassword("J4ruzuph");
    }
}
