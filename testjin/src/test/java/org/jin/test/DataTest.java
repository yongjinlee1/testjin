package org.jin.test;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"
})
public class DataTest {
	
	@Autowired
	private DataSource Source;
	
	
	@Autowired
	private SqlSession session;
	
	
	
	
	@Test
	public void dataTest() {
		
		Assert.assertNotNull(session);
		
		
	}

}
