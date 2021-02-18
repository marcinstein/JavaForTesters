import model.computer.*;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("Laptop Name1", "Type1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("Laptop Name2", "Type2", new Hdd("HP", 500), new Ram("HP", 256), 100));
        computers.add(new Laptop("Laptop Name3", "Type3", new Hdd("HP", 100), new Ram("HP", 256), 100));
        computers.add(new Laptop("Laptop Name4", "Type4", new Hdd("HP", 200), new Ram("HP", 512), 100));
        computers.add(new PC("PC1", "PC1type", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC1", "PC1type", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC1", "PC1type", new Hdd("HP", 500), new Ram("HP", 128)));

        //Count computer with RAM > 128
        System.out.println("================");
        long countComputerWithHighRam = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 128)
                .count();
        System.out.println("There are " + countComputerWithHighRam + " computers with more than 128 RAM");


        //List all Types of computers
        System.out.println("====== List all types of computers ==========");
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);


        //List Computer with highest RAM capacity
        System.out.println("====== List Computer with highest RAM capacity ========");
        Computer computer = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("List of computers is empty"));
        System.out.println(computer.getName());

        //List Computer with highest RAM (to check exception if no computers exist)
        System.out.println("====== List Computer with highest RAM (to check exception if no computers exist) ========");
        Optional<Computer> computer1 = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()));
        System.out.println(computer1.get().getName());

        //List computers with HDD < 500
        System.out.println("====== List computers with HDD < 500 ==========");
        List<Computer> collectCompWithLowHDD = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer comp : collectCompWithLowHDD
        ) {
            System.out.println(comp.getName());
        }

        //Sort computers by Name and Type
        System.out.println("====== Sort computers by Name and Type ==========");
        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer comp : sortedComputers
        ) {
            System.out.println(comp.getName() + " " + " " + comp.getType());
        }

        //ifPresent
        System.out.println("====== List Computer (ifPresent) ========");
        Optional<Computer> computer2 = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()));
        if(computer2.isPresent()){
            System.out.println(computer2.get().getName());
        }

        //Check if there is computer with Name: Laptop Name45 (orElse checking)
        System.out.println("====== Search computer by Name (test orElse functionality) ==========");
        String computerWithGivenName = computers.stream()
                .map(Computer::getName)
                .filter(s -> s.equals("Laptop Name45"))
                .findFirst()
                .orElse("There is no computer with name Laptop Name45");
        System.out.println(computerWithGivenName);

        //Check if there is computer with Name: Laptop Name45 (orElseGet checking)
        System.out.println("====== Search computer by Name (test orElseGet functionality) ==========");
        Computer computerWithGivenName2 = computers.stream()
                .filter(comp -> comp.getType().equals("Laptop Name45"))
                .findFirst()
                .orElseGet(() -> new Laptop("Laptop Name45", "Type4", new Hdd("HP", 200), new Ram("HP", 512), 100));
        System.out.println(computerWithGivenName2.getName());

        //Check if there is computer with Name: Laptop Name456 (orElseThrow checking)
        System.out.println("====== Search computer by Name (test orElseThrow functionality) ==========");
        computers.stream()
                .filter(comp -> comp.getName().equals("Laptop Name4"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("No computer with Name Laptop Name456"));

        //ifPresent functionality
        System.out.println("====== Search computer by Name and list if it starts with P (test ifPresent) ==========");
        computers.stream()
                .filter(comp -> comp.getName().startsWith("P"))
                .findFirst()
                .ifPresent(comp -> System.out.println(comp.getName()));

        //ifPresentOrElse functionality
        System.out.println("====== Search computer by Name and list if it starts with P (test ifPresentOrElse) ==========");
        computers.stream()
                .filter(comp -> comp.getName().startsWith("B"))
                .findFirst()
                .ifPresentOrElse(comp -> System.out.println(comp.getName()), () -> System.out.println("There is no computer B"));
    }
}
