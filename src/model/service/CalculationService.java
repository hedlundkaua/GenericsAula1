package model.service;

import java.util.List;

public class CalculationService {
    public static Integer max(List<Integer> list){

        //programação defensiva
        //se a lista estiver vazia, mostre a exceção
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        //
        Integer max = list.get(0);
        for(Integer item: list){
            //se cada item dessa lista é  maior do que o max
            //chama o primeiro "item", depois o segundo "Max"
            // e compara se for maior que zero
            if(item.compareTo(max) > 0){
                //max recebe o item se TRUE
                max = item;
            }
        }
    return max;
    }
}
