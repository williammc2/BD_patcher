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
public class pt_br {

    ArrayList<String> pt_br = new ArrayList<>();

    public List getpt_br() {
        pt_br.add("1");
        pt_br.add("2");
        pt_br.add("3");
        pt_br.add("4");
        pt_br.add("5");
        return pt_br;

    }

    public String getLista(int j) {

        return pt_br.get(j);

    }

    public int getsize() {
        int size = pt_br.size();

        return size;

    }
}
