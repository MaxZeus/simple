package serialization2;

import java.io.Serializable;
import java.util.List;

public class Employer implements Serializable {
    private String firmName;
    private String firmAddress;
    private int personalSize;
    private List<Employee> employeeList;

    public Employer(String firmName, String firmAddress, int personalSize, List<Employee> employeeList) {
        this.firmName = firmName;
        this.firmAddress = firmAddress;
        this.personalSize = personalSize;
        this.employeeList = employeeList;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmAddress() {
        return firmAddress;
    }

    public void setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
    }

    public int getPersonalSize() {
        return personalSize;
    }

    public void setPersonalSize(int personalSize) {
        this.personalSize = personalSize;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firmName='" + firmName + '\'' +
                ", firmAddress='" + firmAddress + '\'' +
                ", personalSize=" + personalSize +
                ", employeeList=" + employeeList +
                '}';
    }
}
