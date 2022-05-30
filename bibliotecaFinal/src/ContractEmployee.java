public interface ContractEmployee {
    public void admit(Citizen employee); //adicionar funcionario a coleção

    public void dismiss(Citizen employee); //remover da coleção ColectionEmployee

    public void lookForEmployee(Citizen employee);//procurar funcionario especifico na coleção

    public void displayStaff();//exebir tds funcionarios na coleção

    public void isThereAnyEmployee();//atestar se a coleção está vazia ou não
}
