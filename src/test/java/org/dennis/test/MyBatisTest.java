package org.dennis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.dennis.dao.CustomerMapper;
import org.dennis.dao.UserMapper;
import org.dennis.domain.Customer;
import org.dennis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @创建人 dennis[ccc]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public class MyBatisTest {
    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatisForTest.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession.commit();
        sqlSession.close();
        resourceAsStream.close();
    }


    @Test
    public void test01(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void test02(){
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = customerMapper.selectByExample(null);
        for (Customer customer:customers
             ) {
            System.out.println(customer);
        }
    }
}
