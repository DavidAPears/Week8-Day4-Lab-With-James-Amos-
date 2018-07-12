import db.DBDepartment;
import db.DBHelper;
import db.DBManager;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {


//        CEO

        CEO ceo = new CEO("Lloyd Clark", "Eh34",60000.00, 175000.00);
        DBHelper.save(ceo);




//  MANAGERS:

        Manager manager1 = new Manager("David Brent", "HG3866125", 35000.00, 750000.00);
        DBHelper.save(manager1);

        Manager manager2= new Manager("Chris Finch","LD3816183" ,40000.00,100000.00);
        DBHelper.save(manager2);



//  DEPARTMENTS:

        Department humanResources = new Department("Human Resources", manager1, ceo);
        DBHelper.save(humanResources);

        Department finance = new Department("Finance", manager2, ceo);
        DBHelper.save(finance);



//  ADMINISTRATORS:

        Admin admin1 = new Admin("Tim Canterbury", "JS89765432", 27000.00, manager1, humanResources);
        DBHelper.save(admin1);

        Admin admin2 = new Admin("Gareth Keenan", "JT86274452", 25500.00, manager2, finance);
        DBHelper.save(admin2);

        Admin admin3 = new Admin("Dawn Tinsley", "TK93719402", 20000.00, manager1, humanResources);
        DBHelper.save(admin3);




//  METHODS:

//  To return admins for managers:

        List<Admin> adminList1 = DBManager.getAdminForManager(manager1);

        List<Admin> adminList2 = DBManager.getAdminForManager(manager2);

//   To return departments managers are in:

     Department manager1Department = DBManager.getDepartmentForManager(manager2);

//  To return the Departments adm ins are in:

    List<Admin> departnemntsAdmin = DBDepartment.getAdminForDepartment(finance);

//    To add managers to CEO:

        ceo.addManagers(manager1);

    }
}
