package ChainOfResponsibility;

public class Package {

    private String name;

    private int employeeQualification;

    public Package(String name, int employeeQualification) {
        this.setName(name);
        this.employeeQualification = employeeQualification;
    }

    public int getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(int employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
