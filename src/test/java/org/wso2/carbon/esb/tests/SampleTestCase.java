
package org.wso2.carbon.esb.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestCase {

    @BeforeClass(alwaysRun = true)
    public void initTest() {
        System.out.println("init before");
    }

    @Test(groups = "wso2.esb")
    public void testESB1() {
        System.out.println("Test1");
    }

    @Test(groups = "wso2.esb")
    public void testESB2() {
        System.out.println("Test2");
    }


    @Test(groups = "wso2.esb")
    public void testESB3() {
        System.out.println("Test3");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("after class");
    }
}
