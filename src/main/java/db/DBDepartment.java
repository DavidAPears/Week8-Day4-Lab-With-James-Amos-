package db;

import models.Admin;
import models.Department;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBDepartment {

    private static Session session;

    public static List<Admin> getAdminForDepartment(Department department) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Admin> results = null;
        try {
            Criteria cr = session.createCriteria(Admin.class);
            cr.add(Restrictions.eq("department", department));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
