package Homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Vasyl",25, Gender.Male);
        User user2 = new User(2,"Olena",18, Gender.Female);
        User user3 = new User(3,"Andriy",24, Gender.Male);
        User user4 = new User(4,"Oleg",45, Gender.Male);
        User user5 = new User(5,"Oksana",30, Gender.Female);
        User user6 = new User(6,"Vitaliy",22, Gender.Male);
        User user7 = new User(7,"Sergiy",17, Gender.Male);
        User user8 = new User(8,"Nazar",30, Gender.Male);
        User user9 = new User(9,"Katya",38, Gender.Female);
        User user10 = new User(10,"Mariya",27, Gender.Female);

        ArrayList<User> users=new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
// - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
        System.out.println("User id %2==0:");
        users.stream().filter(user -> user.getId() % 2 == 0).forEach(System.out::println);
//- Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
        System.out.println("User name > 5:");
        users.stream().filter(user -> user.getName().length() > 5).forEach(System.out::println);
//- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        System.out.println("User gender Female:");
        users.stream().filter(user -> user.getGender() == Gender.Female).forEach(System.out::println);
    }
}
