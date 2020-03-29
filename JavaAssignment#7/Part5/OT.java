package Part5;

public class OT extends Hospital {
    class ENTDepartment extends Department{
        public ENTDepartment(String department){
            super(department);
        }
    }

    public static void main(String[] args) {
        Hospital hospital=new Hospital();

        Hospital.Department ent=hospital.new Department("ENT");
        System.out.println(ent.getDepartmentName());

        OT ot=new OT();
        ENTDepartment entDepartment=ot.new ENTDepartment("ENT");
        System.out.println(entDepartment.getDepartmentName());
    }
}
