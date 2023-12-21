package Generics.GenericsWithKeyValue;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pairs<K extends Integer, V> { //Veja que passamos a responsabilidade de
    private Set<Pair<K, V>> list = new LinkedHashSet<>(); //escolher os tipos dos
                                                            //objetos de "Pair" adiante
    public void addPair(K key, V value){  //Temos aqui um método que vai instanciar e
        if(key == null) return;             //já adicionar os Pair a lista...

        Pair<K, V> newPair = new Pair<>(key, value); //Aqui temos uma conferência se
        if(list.contains(newPair)){                     //a chave já existe, se sim,
            list.remove(newPair);                       //apenas o valor será subs-
        }                                               //tituído...

        list.add(new Pair<>(key, value));
    }

    public void showValue(K key){                   //Um método para mostrar um valor
        list.stream()                               //específico a partir da chave...
                .filter(v -> key.equals(v.getKey()))
                .findFirst()
                        .ifPresent(v -> System.out.println(v.getValue()));
    }

    public void showAllList() {     //Um método para mostrar todos os itens da lista...
        System.out.println("\n");
        list.stream().forEach(v -> System.out.println(v.getValue()));
    }
}

// Volte agora para a classe "GenericsWithKeyValue...
