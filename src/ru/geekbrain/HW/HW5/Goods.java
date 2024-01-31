package ru.geekbrain.HW.HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Goods {

    private static final List<Item> ITEMS = new ArrayList<>();
    private static final Map<Integer, Bag> HASH = new HashMap<>();
    private static final boolean FIND = true; //whether an item can be added more than once

    public static void main(String[] args) {
        ITEMS.add(new Item(600, 1, "book"));
        ITEMS.add(new Item(5000, 2, "glass"));
        ITEMS.add(new Item(1500, 4, "kit"));
        ITEMS.add(new Item(40000, 2, "laptop"));
        ITEMS.add(new Item(500, 1, "bowl"));
        Bag best = bestBagForCapa(5);
        System.out.println(best.toString());
    }

    public static Bag bestBagForCapa(int capa) {
        if (HASH.containsKey(capa)) return HASH.get(capa);
        if (capa < 0) return null;
        if (capa == 0) return new Bag(0, 0);

        int overWeight = -1;
        int overValue = -1;
        String newItem = null;
        List<String> previousItems = null;
        for (Item p : ITEMS) {
            Bag previous = bestBagForCapa(capa - p.weight);
            if (previous == null) continue;

            int weightSoFar = previous.weight;
            int valueSoFar = previous.value;
            int nextBestValue = 0;
            Item candidateItem = null;
            for (Item candidate : ITEMS) {
                if (FIND && previous.alreadyHas(candidate)) continue;
                if (weightSoFar + candidate.weight <= capa && nextBestValue < valueSoFar + candidate.value) {
                    candidateItem = candidate;
                    nextBestValue = valueSoFar + candidate.value;
                }
            }

            if (candidateItem != null && nextBestValue > overValue) {
                overValue = nextBestValue;
                overWeight = weightSoFar + candidateItem.weight;
                newItem = candidateItem.name;
                previousItems = previous.contents;
            }
        }

        if (overWeight <= 0 || overValue <= 0) throw new RuntimeException("cannot be 0 here");
        Bag bestBag = new Bag(overWeight, overValue);
        bestBag.add(previousItems);
        bestBag.add(Collections.singletonList(newItem));
        HASH.put(capa, bestBag);
        return bestBag;
    }

}

class Item {

    int value;
    int weight;
    String name;

    Item(int value, int weight, String name) {
        this.value = value;
        this.weight = weight;
        this.name = name;
    }

}

class Bag {

    List<String> contents = new ArrayList<>();
    int weight;
    int value;

    boolean alreadyHas(Item item) {
        return contents.contains(item.name);
    }

    @Override
    public String toString() {
        return "weight " + weight + " , value " + value + "\n" + contents.toString();
    }

    void add(List<String> name) {
        contents.addAll(name);
    }

    Bag(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

}


