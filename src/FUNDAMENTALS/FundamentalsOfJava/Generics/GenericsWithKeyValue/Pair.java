package FUNDAMENTALS.FundamentalsOfJava.Generics.GenericsWithKeyValue;

import java.util.Objects;

public class Pair<K, V> { //Veja que já de início definimos que essa classe
    private K key;        //terá um tipo genérico para a Chave e o valor...
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override                                   //Fizemos um hashCode e um
    public int hashCode() {                     //equals para poder comparar
        return Objects.hash(key);               //os objetos dessa classe
    }                                           //futuramente, pois vamos
                                                //querer criar uma classe
    @Override                                   //que receba os objetos de
    public boolean equals(Object o) {           //"Pair" e os inclua numa
        if (this == o) return true;             //lista...
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key);
    }
}

//  Vá agora para "Pairs" para ver a implementação da lista...