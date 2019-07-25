package com.thunneycomb.thunneycombarchtype.testsuite;

import com.thunneycomb.thunneycombarchtype.CaseBase;
import org.junit.Test;


/**
 * thunneycomb-archtype
 * 2019-07-25 17:38
 *
 * @author Daine.H
 * @since 2015
 **/

public class SpringbootTesterDemo extends CaseBase {

    /**
     * spring-boot test starter只支持Junit，单元测试友好， 集成测试不友好。
     */
    @Test
    public void testng_demo () {
        System.out.println("springboot test starter");
    }
}
