package model.service;

import java.util.List;

public class CalculationService {
    //esse métodos vai trabalhar com qualquer tipo T
    // desde que o T seja qualquer subtipo de comparable T
    //usamos a linha a baixo para qualquer superclasse de Product (tipos curinga)
    //public static <T extends Comparable<? super T>>  T max(List<T> list){
    public static <T extends Comparable<T>>  T max(List<T> list){

        //programação defensiva
        //se a lista estiver vazia, mostre a exceção
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        //
        T max = list.get(0);
        for(T item: list){
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
