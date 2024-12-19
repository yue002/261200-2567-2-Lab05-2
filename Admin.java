import java.time.LocalDate;

public class Admin extends Users {
    public Admin(String name, int year, int month, int day ) {
        super(name,  year,  month,  day);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }
    public void displayInfo(boolean full){
        if(full){
            System.out.println("name: " + getName());
            System.out.println("Birthday: " + getDob());
            System.out.println("User type: admin ");
            System.out.println("Today"+ LocalDate.now());

        }
        else {
            System.out.println("name: " + getName());
        }
    }
    public void displayHappyBirthday() {
        int age = 2014 - getDob().getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }
    }
}
