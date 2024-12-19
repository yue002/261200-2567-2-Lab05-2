public class Lec05 extends Users {
    public static void main(String[] args) {
        Users John = new Users("John", 1954, 12, 19);
        John.displayInfo();
        John.displayHappyBirthday();
        System.out.println();

        Admin nicolas = new Admin("Nicolas", 1964, 12, 19);
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);

    }
}

