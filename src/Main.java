import java.util.Scanner;

//Bashaer Alhuthali
//Java Bootcamp

public class Main {
    public static void main(String[] args) {

        //For Account class
        /*Account OBJAccount = new Account("013456789","Bashaer",15000);
        Account OBJAccount1 = new Account("0213456789","Sara",20000);

        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Welcome "+OBJAccount.getName()+" registered by id: "+OBJAccount.getId()+", please choose one of the options:"
            +"\n1.Credit"+"\n2.Debit"+"\n3.TransferTo"+"\n4.Cheking of balance"+"\n5.Exit");
            num=input.nextInt();
            input.nextLine();
            switch (num){
                case 1:
                    System.out.println("\nPlease enter the amount ");
                    int num2=input.nextInt();
                    input.nextLine();
                    int oldBalance=OBJAccount.getBalance();
                    int newBalance=OBJAccount.credit(num2);
                    if(OBJAccount.getBalance() == oldBalance)
                        System.out.println("\nSorry, your balance is not enough ");
                    else
                        System.out.println("\nyour balance after the operation is "+newBalance);
                   break;
                case 2:
                    System.out.println("\nPlease enter the amount ");
                    int num3=input.nextInt();
                    input.nextLine();
                    int newBalance1=OBJAccount.debit(num3);
                    System.out.println("\nYour balance is"+newBalance1);
                    break;
                case 3:
                    System.out.println("\nPlease enter the id of another account ");
                    String id=input.nextLine();
                    if(id.equals(OBJAccount1.getId()))
                    {
                        System.out.println("\nPlease enter the amount ");
                        int num4=input.nextInt();
                        input.nextLine();
                        int oldBalance2=OBJAccount.getBalance();
                        int newBalance2=OBJAccount.transferTo(OBJAccount1,num4);
                        if(OBJAccount.getBalance() == oldBalance2)
                            System.out.println("\nSorry, your balance is not enough ");
                        else
                            System.out.println("\nyour balance after the operation is "+newBalance2);
                    }
                    else
                        System.out.println("\nThe id is invalid ");
                    break;
                case 4:
                    System.out.println("\nYour balance is "+OBJAccount.getBalance());
                    break;
                case 5:
                    System.out.println("\nThank You");
                    break;
                default:
                    System.out.println("\nThe number entered is invalid ");
            }
        }while (num!=5);*/

        //For Employee class

        /*Employee[] OBJEmployee = {new Employee("01","Bashaer",5000), new Employee("02","Sara",2000), new Employee("03","Ahmed",2000)};

        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Welcome to Admin page, please choose one of the options:"
            +"\n1.Get the detailed info of an employee"+"\n2.Update salary of an employee"+"\n3.Display info of all employee"+"\n4.Exit");
            num=input.nextInt();
            input.nextLine();
            switch (num){
                case 1:
                  System.out.println("\nPlease enter id ");
                    String id=input.nextLine();
                    int index=-1;
                    for (int i = 0; i <OBJEmployee.length ; i++) {
                        if(id.equals(OBJEmployee[i].getId()))
                        {index = i;
                            break;}
                    }
                    if(index!=-1)
                    {
                        System.out.println("What is the percent of the raised salary");
                        int percentNum=input.nextInt();
                        input.nextLine();
                        System.out.println("\nThe Name is "+OBJEmployee[index].getName()+"\nThe salary is "+OBJEmployee[index].getSalary()+"\nThe annual Salary is "+OBJEmployee[index].getAnnualSalary()+"\nThe salary with raised is "+OBJEmployee[index].raisedSalary(percentNum));
                    }
                    else
                        System.out.println("\nthe id is not found ");

                    break;
                case 2:
                    System.out.println("\nPlease enter the id ");
                    String id1=input.nextLine();
                    int index1=-1;
                    for (int i = 0; i <OBJEmployee.length ; i++) {
                        if(id1.equals(OBJEmployee[i].getId()))
                        {index1 = i;
                            break;}
                    }
                    if(index1!=-1)
                    {
                        System.out.println("\nPlease enter the new salary ");
                        int salary1= input.nextInt();
                        input.nextLine();
                        OBJEmployee[index1].setSalary(salary1);
                    }
                    else
                        System.out.println("\nThe id is not found ");
                    break;
                case 3:
                    for (int i = 0; i <OBJEmployee.length ; i++)
                        System.out.println(OBJEmployee[i].toString());
                    break;
                case 4:
                    System.out.println("\nThank You");
                    break;
                default:
                    System.out.println("\nThe number entered is invalid ");
            }
        }while (num!=4);*/

    }

}
