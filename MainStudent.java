public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        
    System.out.println("===================");
    Student maria = new Student("Maria", "Kediri", 21);
    maria.setMath(70);
    maria.setScience(60);
    maria.setEnglish(90);
    maria.displayMessage();

    System.out.println("===================");
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();

    System.out.println("===================");
    maria.setAddress("Surabaya");
    maria.setAge(22);
    maria.displayMessage();

    System.out.println("===================");
    Student yuki = new Student("Yuki", "Bandung", 20, 80, 75, 90);
    yuki.displayMessage();
    }
}