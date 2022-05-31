import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ColectionEmployee listOfEmployee = new ColectionEmployee();

        System.out.println("******* WELCOME TO LEBRARY SYSTEM ******* ");
        while (true) {
            showPrincipalMenu();
            int firstMenu = sc.nextInt();
            if (firstMenu == 1) {
                while(true) {
                    System.out.println("+------------MENU---RH-------------+\n" +
                            "+                                               +\n" +
                            "+          [1] - HIRED                 +\n" +
                            "+          [2] - FIRED                 +\n" +
                            "+          [3] - LOOK FOR              +\n" +
                            "+          [4] - DISPLAY STAFF         +\n" +
                            "+          [5] - IS THERE ANY EMPLOYEE+\n" +
                            "+          [0] - BACK                 +\n" +
                            "+-------------------------------------+\n"
                    );

                    int secondMenu = sc.nextInt();

                    if (secondMenu == 1) {
                        System.out.println("Type the employee name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Type number of the CPF eg(097.927.154-10): ");
                        String cpf = sc.nextLine();
                        System.out.println("Type number of the Cttp eg(124): ");
                        int ctps = sc.nextInt();
                        System.out.println("Type the role: ");
                        sc.nextLine();
                        String role = sc.nextLine();
                        System.out.println("Type salary of the employee: ");
                        double salary = sc.nextDouble();
                        listOfEmployee.admit(new Employee(name, cpf, ctps, role, salary));

                    } else if (secondMenu == 2) {
                        System.out.println("Type the cpf that employee that you want research");
                        String cpf = sc.next();
                        listOfEmployee.dismiss(cpf);
                    } else if (secondMenu == 3) {
                        System.out.println("Type the cpf that employee that you want research");
                        String cpf = sc.next();
                        listOfEmployee.lookForEmployee(cpf);

                    } else if (secondMenu == 4) {
                        listOfEmployee.displayStaff();
                    } else if (secondMenu == 5) {
                        listOfEmployee.isThereAnyEmployee();
                    } else if (secondMenu == 0) {
                        continue;
                    }
                }
            }
            else if(firstMenu == 0){
                break;
            }


        }
        sc.close();
    }

    private static void showPrincipalMenu() {
        System.out.print("----------------------------------------+\n" +
                "+               MENU                   +\n" +
                "+                                      +\n" +
                "+          [1] - RH                    +\n" +
                "+          [2] - STORAGE               +\n" +
                "+          [3] - BORROW                +\n" +
                "+          [0] - GET OUT               +\n" +
                "+-------------------------------------+ \n");
    }
}
