package com.us.user.demo.config;

import com.us.claudine.test.AbstractCommonTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName DatasourceConfigTest
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/2 7:47 PM
 * @Version 1.0
 **/
public class DatasourceConfigTest extends AbstractCommonTest {

    @Autowired
    private DatasourceConfig datasourceConfig;

    @Autowired
    private AdminConfig adminConfig;

    @Autowired
    private SingleDatasourceConfig singleDatasourceConfig;

    @Test
    public void test() {
        System.out.println(datasourceConfig);
        System.out.println(adminConfig);
        System.out.println(singleDatasourceConfig);
    }

}
