package PakListop_3_4_2018;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Zad2 {

      //  List<Employee> lista=new ArrayList<>()List();
       // Files part=new Files();
       // Files.lines(Paths.get("D:\\KursJava\\Listopad\\List3_4_2018\\src\\PakListop_3_4_2018\\dane.txt"));
        public static void main(String[] args)
            throws IOException {
            File file = new File("D:\\KursJava\\Listopad\\List3_4_2018\\src\\PakListop_3_4_2018\\dane.txt");
            //File file = new File("dane.txt");

            Scanner fileScanner = new Scanner(file);

            List<Employee> emplList = new ArrayList();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] splitArray = line.split(";");
                Employee employee = new Employee(splitArray[0], splitArray[1],
                        splitArray[2], Long.valueOf(splitArray[3]));

                emplList.add(employee);
            }

            Collections.sort(emplList, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return (int) (o1.getId() - o2.getId());
                }
            });


            List<String> lines = emplList.stream()
                    .map(e -> e.getName() + ";" + e.getSurname() + ";" +
                            e.getPosition() + ";" + e.getId())
                    .collect(Collectors.toList());

            Files.write(Paths.get("result.txt"), lines);
        }
    }


