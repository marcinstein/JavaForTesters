import enums.Gender;
import model.bug.Bug;
import model.bug.BugReporter;
import model.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        //Nowy enum gender K,M
        //user dodac gender i gettery i settery
        //nowy konstruktor jako parameter enum
        //utworzyc kilku uzytkownikow
        // wyszukac tylko kobiety

        //plik txt
        //wczytac imiona do listy
        //spr czy lista zawiera imiona jak nie to wyjatek
        //wlasny wyjatek IllegalBugPriorityException i rzucic go z klasy Bug z metody setBugPriority
        List<User> users = new ArrayList<>();
        users.add(new User("Marcin", "Testowy", "Marcin@test.aaa", 20, Gender.MALE));
        users.add(new User("Kasia", "Testowa", "Kasia@test.aaa", 21, Gender.FEMALE));
        users.add(new User("Basia", "Testowa", "Basia@test.aaa", 19, Gender.FEMALE));
        users.add(new User("Roman", "Testowy", "Roman@test.aaa", 19, Gender.MALE));
        users.add(new User("Grzegorz", "Testowy", "Grzegorz@test.aaa", 30, Gender.MALE));
        users.add(new User("Ola", "Testowa", "Ola@test.aaa", 20, Gender.FEMALE));

        List<User> female = users.stream()
                .filter(user -> user.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        for (User user : female) {
            System.out.println(user);
        }

        List<String> names = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
 //           BufferedReader bufferedReader = new BufferedReader(new FileReader("test1234.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                names.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        names.stream()
//                .filter(name -> name.equalsIgnoreCase("Oskar"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Oskar not found"));

        Bug bug = new Bug("Bug description", new BugReporter("Marcin", "Testowy","marcin@email.aa"),4);
        bug.setBugPriority(6);


    }
}
