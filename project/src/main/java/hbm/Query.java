package hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.hibernate.hbm
 * Query.java
 *
 * ���� : ���̹�����Ʈ ���� �׽�Ʈ
 * </pre>
 * 
 * @since : 2017. 10. 26.
 * @author : tobby48
 * @version : v1.0
 */
public class Query {
	public static void main( String[] args ){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        SWHAcademy user = new SWHAcademy();
        user.setEmail("swhacademy@gmail.com");
        user.setName("SWH");
        user.setId("key");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("Insert completed");

        session.beginTransaction();
        SWHAcademy myuser = (SWHAcademy)session.get(SWHAcademy.class, "key");
        System.out.println("name:"+myuser.getName());
        myuser.setName("SWHAcademy");
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
    }
}
