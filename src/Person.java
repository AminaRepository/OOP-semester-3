public class Person {
    String name;
    int age;
    public Person(String s, int a){
        name = s;
        age = a >= 0 && a <= 120 ? a : -1;
        if (age == -1)
            throw new IllegalArgumentException("age must be between 0 and 120");

        if(name == null || name.equals("") || name.length() > 40)
            throw new IllegalArgumentException("name can not be empty or longer than 40 characters");
    }
}
