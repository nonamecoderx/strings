public class Main {
    public static void main(String[] args) {
        //задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //задание 3
        String newFullName = "Иванов Семён Семёнович";
        String replacedString = newFullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + replacedString);
    }
}

