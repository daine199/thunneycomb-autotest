package com.thunneycomb.thunneycombarchtype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestNGCaseBase {
//
//	@Test
//	public void contextLoads() {
//	}
//
//}

@SpringBootTest(classes = ThunneycombArchtypeApplication.class)
public class TestNGCaseBase extends AbstractTestNGSpringContextTests {

    Logger logger = LoggerFactory.getLogger(TestNGCaseBase.class);

    @BeforeMethod
    public void setUp() {
        logger.info("Init TestNGCaseBase.");
    }
}
