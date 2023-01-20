package com.task012;

import java.util.List;

public class DeleteElements <T> {

    public void deleteElements(List<T> list) {
        list.remove(0);
        list.remove(0);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
