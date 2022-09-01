public class Student extends Person {

    public final Gender gender;

    /**
     * Full constructor
     * @param name Name of the student
     * @param age Age of the student -> Person
     * @param gender Gender of the student -> Person
     */
    public Student(String name, int age, Gender gender){
        super(name, age);
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Estudiante: " + "nombre: " + name + " genero: " + gender + " edad: " + age;
    }

    enum Gender {
        FEMALE, MALE;
    }

}
