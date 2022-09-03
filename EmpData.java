package Encapsulation;

public class EmpData {

    // 2. Create a variable
    public int Id;
    public String Name;
    private int Salary;

    //1.
    public static void main(String[]args ) {

        //Simple Variable access

         EmpData EmpDat = new EmpData();
         EmpDat.Id =123;
         EmpDat.Name = "Tester";
         EmpDat.Salary = 23300;
         System.out.println(EmpDat.Id);
         System.out.println(EmpDat.Name);
        System.out.println(EmpDat.Salary);


    }



}
