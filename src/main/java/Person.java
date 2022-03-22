import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;
    Calendar c = new GregorianCalendar();

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }
    public void printName() {
        System.out.println("Имя: " + this.name);
    }
    public void printYear() {
        System.out.println("Год рождения: " + (Calendar.YEAR - this.age));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + middleName + ", " + age + " ";
    }
}