import model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        String path = "C:\\Windows\\Temp\\numbers.csv";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while (line != null){
                //transformar line em Integer
                list.add(Integer.parseInt(line));
                line = bf.readLine();
            }
            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }catch (IOException e){
             System.out.println("Error: " + e.getMessage());
        }
    }
}