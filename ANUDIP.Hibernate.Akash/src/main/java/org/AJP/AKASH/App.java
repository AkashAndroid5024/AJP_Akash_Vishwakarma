package org.AJP.AKASH;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        // System.out.println(factory);
        Employee emp=new Employee();

        emp.setId (102);

        emp.setName ("Ram");

        emp.setSalary(40000);
        emp.setAge(29);

        System.out.println(emp);

        Session session=factory.openSession();

        session.beginTransaction();

        session.save (emp);

        session.getTransaction().commit();

        session.close();

    }
}
