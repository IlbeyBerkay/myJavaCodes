public class Main {
    public static void main(String[] args) {
        Person person  = new Person();
        person.setFirstName("İlbey");
        person.setLastName("Öztürk");
        person.setAge(-10);
        System.out.println("First Name = " +person.getFirstName());
        System.out.println("Last Name= " + person.getLastName());
        System.out.println("Full Name= " + person.getFullName());
        System.out.println("Age = " + person.getAge());
        System.out.println("teen= " + person.isTeen());

    }
}
