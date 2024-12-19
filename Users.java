import java.time.LocalDate;

public class Users {
    private String name;
    private LocalDate dob;

    public Users(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public Users(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year , month , day);

    }
    public String getName(){
        return name;
    }

    public LocalDate getDob(){
        return  dob;
    }

    public boolean isBirthday(){
        LocalDate today = LocalDate.now(); // Get today's date
        return today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayInfo(){
        System.out.println(name+ " was born on "+dob );

    }
    public void displayHappyBirthday() {
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }

}
