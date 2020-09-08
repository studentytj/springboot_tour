package com.ytj.testcustomstarter;

import com.ytj.mystarter.business.ExampService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class TestCustomStarterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    ExampService exampService;

    @Test
    public void testStarter(){
        String aaa = exampService.wrap("aaa");
        System.out.println(aaa);
    }

}
