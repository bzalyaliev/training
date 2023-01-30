package javafromepam.classesandmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    /*
    Создать классы, спецификации которых приведены ниже.
    Определить конструкторы и методы setТип(), getТип(), toString().
    Определить дополнительно методы в классе, создающем массив объектов.
    Задать критерий выбора данных и вывести эти данные на консоль.
    В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
    Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    Создать массив объектов. Вывести:
    a) список студентов заданного факультета;
    b) списки студентов для каждого факультета и курса;
    c) список студентов, родившихся после заданного года;
    d) список учебной группы.
     */

    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String address;
    private String phone;
    private String faculty;
    private String course;
    private String group;


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

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }

    public void getStudent() {

    }

    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", "01.01.1990", "Lenina street", "+7123456789", "Physics", "2", "B777");
        Student student2 = new Student("Petrov", "Petr", "Petrovich", "02.02.1990", "Gogolya street", "+7123456789", "Math", "2", "B778");
        Student student3 = new Student("Sidorov", "Sidor", "Sidorovich", "03.03.1990", "Karla Marksa street", "+7123456789", "IT", "2", "B779");

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        showStudentsByFaculty(students);

    }

    private static void showStudentsByFaculty(Student[] students) {
        for (Student oneStudent : students) {
            if (oneStudent.faculty.equals("Physics")) {
                System.out.println(oneStudent);
            }
        }
    }

}
