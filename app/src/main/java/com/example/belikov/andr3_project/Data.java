package com.example.belikov.andr3_project;

import java.util.ArrayList;
import java.util.List;

class Data {
    private List<String> list;
    public Data(){
        list = new ArrayList<>();
        list.add("Ананас");
        list.add("Апельсин");
        list.add("Киви");
        list.add("Манго");
        list.add("Яблоко");
        list.add("Лимон");
        list.add("Груша");
        list.add("Мандарин");
    }

    public List<String> getList(){
        return list;
    }
}
