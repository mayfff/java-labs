import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Данило", "Закревський", 19);
        System.out.println("Оригінальний об'єкт: " + person);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Серіалізований  JSON: " + json);

        Person person2 = gson.fromJson(json, Person.class);
        System.out.println("Десеріалізований JSON: " + person2);

        System.out.println(person.equals(person2));
    }
}