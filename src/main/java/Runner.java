import db.DBHelper;
import db.DBManager;
import models.Department;
import models.Employee;
import models.Manager;
import models.Admin;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



//  MANAGERS:

        Manager manager1 = new Manager("David Brent", "HG3866125", 35000.00, 750000);
        DBHelper.save(manager1);

        Manager manager2= new Manager("Chris Finch","LD3816183" ,40000.00,10000.00);
        DBHelper.save(manager2);



//  DEPARTMENTS:

        Department humanResources = new Department("Human Resources", manager1);
        DBHelper.save(humanResources);

        Department finance = new Department("Finance", manager2);
        DBHelper.save(finance);



//  ADMINISTRATORS:

        Admin admin1 = new Admin("Tim Canterbury", "JS89765432", 27000.00, manager1);
        DBHelper.save(admin1);

        Admin admin2 = new Admin("Gareth Keenan", "JT86274452", 25500.00, manager2);
        DBHelper.save(admin2);

        Admin admin3 = new Admin("Dawn Tinsley", "TK93719402", 20000.00, manager1);
        DBHelper.save(admin3);



//  METHODS:

        List<Admin> adminList1 = DBManager.getAdminForManager(manager1);

        List<Admin> adminList2 = DBManager.getAdminForManager(manager2);

     Department manager1Department = DBManager.getDepartmentForManager(manager2);

    }
}
