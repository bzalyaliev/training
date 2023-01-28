package javafromepam.classesandmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    /*
    Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    Создать массив объектов. Вывести:
    a) список студентов заданного факультета;
    b) списки студентов для каждого факультета и курса;
    c) список студентов, родившихся после заданного года;
    d) список учебной группы.
     */

    private final String surname;
    private final String name;
    private final String patronymic;
    private final String birthday;
    private final String address;
    private final String phone;
    private final String faculty;
    private final String course;
    private final String group;


    public Student(String surname, String name, String patronymic, String birthday, String address, String phone, String faculty, String course, String group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", "01.01.1990", "Lenina street", "+7123456789", "Physics", "2", "B777");
        Student student2 = new Student("Petrov", "Petr", "Petrovich", "02.02.1990", "Gogolya street", "+7123456789", "Math", "2", "B778");
        Student student3 = new Student("Sidorov", "Sidor", "Sidorovich", "03.03.1990", "Karla Marksa street", "+7123456789", "IT", "2", "B779");

        String settingFaculty = "Physics";
        List<Student> students = List.of(student1, student2, student3);
        List<String> studentsByFaculty = new ArrayList<>();
        for (Student student: students) {
            if (Objects.equals(student.faculty, settingFaculty)) {
                studentsByFaculty.add(student.surname);
            }
        }
        System.out.println("Список студентов, обучающихся на факультете " + settingFaculty + ": " + studentsByFaculty);

    }
}
