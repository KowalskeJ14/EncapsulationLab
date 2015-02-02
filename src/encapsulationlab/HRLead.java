/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationlab;
public class HRLead {
    
    private Employee employee;
    
    public void hire(String firstName, String lastName, String ssn){
        employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(ssn);
    }
    
    public void startOrientation(){
        employee.getHired();
        employee.getStatus();
    }
    
    public void walkToCubicle(){
        employee.setCubeId("14");
        employee.getStatus();
    }
}