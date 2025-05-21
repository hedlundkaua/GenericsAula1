import model.entities.Product;
import model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "C:\\Windows\\Temp\\products.csv";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while (line != null){
            String[] fields = line.split(",");
                //transformar line em Integer
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bf.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }catch (IOException e){
             System.out.println("Error: " + e.getMessage());
        }
    }
}