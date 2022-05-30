import java.util.List;
import java.util.ArrayList;
public class ColectionEmployee implements ContractEmployee{
    ArrayList<Citizen> listOfEmployee = new ArrayList<>();

    public void admit(Citizen employee){
        listOfEmployee.add(employee);
        System.out.println("Hired Employee!");
    }

    public void dismiss(Citizen employee){
        listOfEmployee.remove(employee);
        System.out.println("Demiss Employee!");
    }

    public void lookForEmployee(Citizen employee){

        Employee emp = new Employee();
        for(int i = 0; i<=listOfEmployee.size(); i++){
            if(listOfEmployee.get(i).getCpf().equals(emp.getCpf())){
                System.out.println(listOfEmployee.get(i));
            }else{
                System.out.println("Employee did not find!");
                break;
            }
        }
        /*int indexEmployee = listOfEmployee.indexOf(employee);
        System.out.println("The index of the employee is " + Integer.toString(indexEmployee));*/

    }

    public void displayStaff(){

        System.out.println("************ CURRENT STAFF ************");
        for (int i = 0; i < listOfEmployee.size(); i++){
            System.out.println("["+ (i + 1) +"] -" +  listOfEmployee.get(i).getName() + " - " + listOfEmployee.get(i).getCpf());
        }
    }

    public void isThereAnyEmployee() {
        if (listOfEmployee.size() > 0) {
            System.out.println("The size is " + listOfEmployee.size());
        } else {
            System.out.println("Is empety");
        }
    }
}
