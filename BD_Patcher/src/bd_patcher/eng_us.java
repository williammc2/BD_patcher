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
        eng_us.add("LanguageData.xlsm");
        eng_us.add("stringtable_cutscene_ru.xlsm");
        eng_us.add("stringtable_ru.xlsm");
        eng_us.add("symbolnostringtable_ru.xlsm");
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
