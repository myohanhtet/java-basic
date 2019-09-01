package fairway.javabasic.Json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Run {

    public static void main(String[] args) throws FileNotFoundException {

        String userText = TextReader.readText(new FileInputStream("user.json"));

        User user1 = UserDesearializer.parse(userText);

        System.out.println(user1.getAge());

        System.out.println(user1.getName());

        GenericDeserlizer<User> user2 = new GenericDeserlizer<>(User.class);
        User u = user2.parse(userText);

        System.out.println("GD"+ u.getName());

        String depText = TextReader.readText(new FileInputStream("department.json"));
        GenericDeserlizer<Department> dep1 = new GenericDeserlizer<>(Department.class);

        Department de = dep1.parse(depText);
        System.out.println("This is " + de.getName());

    }

}
