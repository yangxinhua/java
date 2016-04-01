import com.aop.Foo;
import com.ioc.bean.IocBean;
import com.ioc.di.property.bean.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jacky on 2016/3/31.
 */
public class TestIoc {
    @Test
    public void testioc()
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        IocBean iocbean=ac.getBean("iocbean", IocBean.class);
        iocbean.say();
    }

    @Test
    public void testDIbyconstructor()
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        com.ioc.di.constructor.bean.ViewerBean viewerbean=ac.getBean("viewerbeanbyconstructor", com.ioc.di.constructor.bean.ViewerBean.class);

    }

    @Test
    public void testDIbysetter()
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        com.ioc.di.setter.bean.ViewerBean viewerbean=ac.getBean("viewerbeanbysetter",  com.ioc.di.setter.bean.ViewerBean.class);

    }

    @Test
    public void testBasicDataSource()
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        BasicDataSource basicDataSource=ac.getBean("basicdatasourcebean",  com.ioc.di.property.bean.BasicDataSource.class);

    }

    @Test
    public  void testAOP()
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        Foo foo=ac.getBean("foo",  Foo.class);
        foo.say();
    }
}
