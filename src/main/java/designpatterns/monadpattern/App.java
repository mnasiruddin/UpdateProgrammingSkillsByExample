package designpatterns.monadpattern;

public class App {

    public static void main(String... args) {
        User user = new User("saasa", "dsdsds", "sdsdd");
        Validator<User> val = Validator.of(user);
        val.validate(u -> !u.getEmail().isEmpty(), "Not valid Email");
        val.validate(u -> !u.getName().isEmpty(), "Not valid name");
        val.validate(User::getColor, u -> !u.isEmpty(), "Not valid color");
        val.get();
    }

}