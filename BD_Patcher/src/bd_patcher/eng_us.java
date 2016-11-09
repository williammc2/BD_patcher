/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_patcher;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author supmac
 */
public class eng_us {

    ArrayList<String> eng_us = new ArrayList<>();

    public List geteng_us() {
        eng_us.add("1");
        eng_us.add("2");
        eng_us.add("3");
        eng_us.add("4");
        eng_us.add("5");
        return eng_us;
    }

    public String getLista(int j) {

        return eng_us.get(j);
    }

    public int getsize() {
        int size = eng_us.size();

        return size;
    }

}
