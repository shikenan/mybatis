package test;

import com.bjsxt.DemoSpringBoot;
import com.bjsxt.mapper.UserMapper;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringBoot.class)*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringBoot.class)
public class My {
    @Resource
    private UserMapper userMapper;
    @Test
    public void test(){
        //System.out.println(userMapper.selectAll());
       /* Tempalte tempalte = new Tempalte(35,"li");
        Map<String,Integer> map = new HashMap<>();
        map.put("mid",60);
        map.put("id",12);
        System.out.println(userMapper.selectOne(map,tempalte));*/

        Student student = new Student(4,3,"史天",28,null);

        /*Student student1 = new Student();
        student1.setSid(2);
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);*/

        System.out.println(userMapper.selectAll());




    }

}
