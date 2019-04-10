/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayerj
 */
public class ListWriter implements Writer {

    @Override
    public void writeln(String line) {
        List<String> myList2 = new ArrayList<>();
        myList2.add(line);
        System.out.println(line);
    }

}
