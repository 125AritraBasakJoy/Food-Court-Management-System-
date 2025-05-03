import java.lang.*;
import java.util.*;
public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mannager Manager = new mannager();
        
        
        String username = "XYZ";
        String password = "123";
       
        String username1;
        String password1;
        System.out.print("Username    : ");
        username1 = input.next();
        System.out.print("Password    : ");
        password1 = input.next();

        if (username.equals(username1) && password.equals(password1)){
            System.out.println("------------------------------");
            System.out.println("Log in succesfull !!!");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("\tWelcome!");
            System.out.println();
            int repeat = 0 , option ;
            do {
                System.out.println(" 1 . Add employee    ");
                System.out.println(" 2 . Remove employee    ");
                System.out.println(" 3 . Search employee    ");
                System.out.println(" 4 . Show all employee    ");
                System.out.println(" 5 . Exit    ");
                System.out.println();
                System.out.print("Enter an option : ");
                option = input.nextInt();
                System.out.println();

                switch(option){
                    case 1 :
                    System.out.println("---------------------------------");
                    System.out.println("     Employee insertion");
                    System.out.println("---------------------------------");
                    System.out.println();
                            System.out.print("Enter employee name : ");
                            String name1 = input.next();
                            System.out.print("Enter employee ID   : ");
                            String Id = input.next();
                            System.out.print("Enter employee age  : ");
                            int age = input.nextInt();
                            employee Employee = new employee();
                            Employee.setAge(age);
                            Employee.setID(Id);
                            Employee.setName(name1);
                            if (Manager.insertEmployee(Employee)){

                                System.out.println();
                                System.out.println("---------------------------------");
                                System.out.println("Employee inserted ");
                                System.out.println("---------------------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("---------------------------------");
                                System.out.println("Cannot insert Employee");
                                System.out.println("---------------------------------");
                                System.out.println();
                            }
                            break;

                    case 2 :
                    System.out.println("---------------------------------");
                    System.out.println("      Employee removing ");
                    System.out.println("---------------------------------");
                    System.out.println();
                            System.out.print("Enter employee ID : ");
                            String id = input.next();
                            if(Manager.removeEmployee(id)){
                                System.out.println();

                                System.out.println("---------------------------------");
                                System.out.println("Employee removed ID :" + id);
                                System.out.println("---------------------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("---------------------------------------");
                                System.out.println("Couldn't find the employee to remove !");
                                System.out.println("---------------------------------------");
                                System.out.println();
                            }
                            break;
                    case 3 :
                    System.out.println();
                    System.out.println("---------------------------------");
                    System.out.println("     Employee searching");
                    System.out.println("---------------------------------");
                    System.out.println();
                            employee Employee2 = new employee();
                            System.out.print("Enter employee ID : ");
                            String Id2 = input.next();                           
                            Employee2 = Manager.searchEmployee(Id2);
                            if (Employee2 != null){
                                System.out.println();
                                System.out.println("---------------------------------");
                                System.out.println("            Found !");
                                System.out.println("---------------------------------");
                                System.out.println();
                                System.out.println("Employee name : "+Employee2.getName());
                                System.out.println("Employee ID : "+Employee2.getEmployeeId());
                                System.out.println("Employee age : "+Employee2.getAge());
                                System.out.println();
                                System.out.println();

                            }else{
                                System.out.println();
                                System.out.println("---------------------------------");
                                System.out.println("         Not Found !");
                                System.out.println("---------------------------------");
                                System.out.println();
                            }
                            break;

                    case 4 :
                    System.out.println("---------------------------------");
                    System.out.println("   Showing all employee's");
                    System.out.println("---------------------------------");
                    Manager.showAll();
                    break;
                    case 5 :
                    System.out.println("----------------------");
                    System.out.println("       Exit");
                    System.out.println("----------------------");
                    System.exit(0);
                    break;
                }

                System.out.print("Enter 1 to Go back to the main menu : ");
                repeat = input.nextInt();
                System.out.println();

            }while(repeat == 1);
        }else{
            System.out.println("Incorrect password or username !");
        }
    }
    
}
