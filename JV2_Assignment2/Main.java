package JV2_Assignment2;

public class Main {
    public static void main(String[] args) {
        PersonModel<student> studentPersonModel = new PersonModel<>();
        studentPersonModel.add(new student(1, 18, " Kiên"));
        studentPersonModel.add(new student(2, 19, " Công"));
        studentPersonModel.input();
        PersonModel<Employee> employeePersonModel = new PersonModel<>();
        employeePersonModel.add(new Employee(3, 20.0000, " Dân"));
        employeePersonModel.add(new Employee(4, 30.000, " Giang"));
        employeePersonModel.input();
    }
}
