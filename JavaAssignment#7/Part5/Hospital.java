package Part5;/*Create a class with an inner class that has a non-default constructor
(one that takes arguments).Create a second class with an
inner class that inherits from the first inner class.
 */

public class Hospital{
    private String hospitalName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    class Department{
        private String departmentName;

        public Department(String department) {
            this.departmentName=department;
        }

        public String getDepartmentName() {
            return departmentName;
        }



    }


}