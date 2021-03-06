public class Employee {
    private String name;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String name, String position, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void FIO () {System.out.println("ФИО сотрудника - " + name);}
    void pos () {System.out.println("Должность сотрудника - " + position);}
    void tel () {System.out.println("Телефон сотрудника - " + phoneNumber);}
    void zp () {System.out.println("Зарплата сотрудника - " + salary);}
    void voz () {System.out.println("Возраст сотрудника - " + age);}

    void show () {
        System.out.println("ФИО " + name + ", Должность " + position + ", Телефон " +  phoneNumber + ", Зарплата " + salary + ", Возраст " + age);
    }

    public String getName() {return name;}
    public String getPosition() {return position;}
    public String getPhoneNumber() {return phoneNumber;}
    public int getSalary() {return salary;}
    public int getAge() {return age;}

}
