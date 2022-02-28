package com.delprete.supermercato;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({"/schema.sql","/data.sql"})
public class CreaDbTest {
	@Test
	void creaTabelle() {
	}
}
