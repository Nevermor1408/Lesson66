package JARFILES;
import TerminalIO.*;

public class PayrollInterface {
    
    
    public static void main (String[] args){
        KeyboardReader r = new KeyboardReader();
        Employeee emp;
        String name;
        int type;
        double rate;
        int hours;
        String prompt;
        emp = new Employeee();
        while(true){
            System.out.println("Enter employee data: ");
            name = r.readLine("  Name (or <enter> to quit)  :   ");
            if (!(emp.setName(name)))break;
            while (true){
                prompt = "  Type(" +emp.getTypeRules()+"): ";
                type = r.readInt(prompt);
                if (emp.setType(type)) break;
            }
        
            while(true){
            prompt = " Hourly rate("+emp.getRateRules()+") ";
            rate = r.readDouble(prompt);
            if(emp.setRate(rate))break;
        }
        while(true){
            prompt = " Hours(" +emp.getHourRules()+"): ";
            hours = r.readInt(prompt);
            if (emp.setHours(hours)) break;
        }
        System.out.println("  The Weekly Pay For ");
        System.out.println(emp.getName());
        System.out.println(" is $" +emp.getPay());       
        
    }
    }
}

