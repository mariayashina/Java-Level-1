public class Level_1_Lesson_4 {
public static void main(String[] args) {

    Employee emp1 = new Employee("Борисов Сергей Алексеевич", "Технолог", "+7(745)477-14-14", 100000, 33);
    emp1.FIO();
    emp1.pos();

    Employee[] employees = new Employee[] {
    new Employee("Иванов Иван Иванович", "Директор", "+7(987)154-26-54", 150000, 47),
    new Employee("Петров Петр Петрович", "Главный технолог", "+7(542)164-45-75", 120000, 42),
    new Employee("Семенова Ольга Геннадьевна", "Финансовый директор", "+7(548)-546-85-88", 140000, 37),
    new Employee("Сидорова Евгения Семеновна", "HR директор", "+7(578)-457-44-84", 130000, 41),
    new Employee("Егорова Екатерина Александровна", "Ассистент", "+7(917)-112-65-88", 70000, 29)
};


    for(Employee item : employees) {
        if(item.getAge() > 40) item.show();
    }

}
}
