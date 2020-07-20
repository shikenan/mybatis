package test;

import com.bjsxt.DemoSpringBoot;
import com.bjsxt.mapper.UserMapper;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.bjsxt.test.OriginPojo;
import com.bjsxt.test.OriginPojo2;
import com.bjsxt.test.OriginPojoAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.*;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringBoot.class)*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringBoot.class)
public class My {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OriginPojoAspect originPojoAspect;
    @Autowired
    private OriginPojo originPojo;
    @Autowired
    private OriginPojo2 originPojo2;
    @Test
    public void test(){
        //System.out.println(userMapper.selectAll());
       /* Tempalte tempalte = new Tempalte(35,"li");
        Map<String,Integer> map = new HashMap<>();
        map.put("mid",60);
        map.put("id",12);
        System.out.println(userMapper.selectOne(map,tempalte));*/

        /*Student student = new Student();
        student.setStName("王波");
        student.setStAge(32);
        student.setTid(1);*/
        /*Student student1 = new Student();
        student1.setSid(2);
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);*/



      /*  userMapper.insert2(student);

        System.out.println(student);*/

      originPojo.testTea();
      originPojo.testStu();
      originPojo2.test1();





    }

    public static void main(String[] args) {
        int[] arr = {21,2,13,454,5};
        try {
            Class<?> aClass = Class.forName("test.My");
            Method bubbleSort = aClass.getMethod("bubbleSort", int[].class);
            bubbleSort.invoke(My.class,arr);
            System.out.println("-------------------");
            System.out.println(Arrays.toString(arr));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void bubbleSort(int[] arr){
        int temp =0;
        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }



    }





