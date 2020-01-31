import java.lang.reflect.Array;

public class Task1 {

    static class Person {
        String fullName;
        String position;
        String email;
        String phoneNumber;
        int salary;
        int age;

        public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;

        }

        public void info() {
            System.out.println("FullName " + fullName + "; " + "Position " + position + "; " + "Email " + email + "; " +
                      "PhoneNumber " + phoneNumber + "; " + "Salary " + salary + "; " + "Age " + age);
        }

        int getAge() {
            return age;
        }


    }

    public static void main(String[] args) {

        Person[] Array = new Person[5];
        Array[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 23);
        Array[1] = new Person("Zinchenko Sergey", "CEO", "zinchenko@mailbox.com", "892312313", 300000, 45);
        Array[2] = new Person("Zbrodov Andrei", "Vet", "zbrodov@mailbox.com", "892312314", 100000, 43);
        Array[3] = new Person("Kolesnikov Denis", "Owner", "kolesnikov@mailbox.com", "892312315", 600000, 30);
        Array[4] = new Person("Sychoi Dmitrii", "Driver", "suchoi@mailbox.com", "892312316", 25000, 50);

        for(Person item : Array) {
            if(item.getAge()> 40) item.info();
        }

    }
}


