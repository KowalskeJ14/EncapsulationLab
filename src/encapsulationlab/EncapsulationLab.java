/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationlab;

/**
 *
 * @author kowal_000
 */
public class EncapsulationLab {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        
        
        
        HRLead employer = new HRLead();
        
        employer.hire("Jared", "Kowalske", "444-44-4444");
        employer.startOrientation();
        employer.walkToCubicle();
    }
}
