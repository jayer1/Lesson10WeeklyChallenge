/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ayerj
 */
public class ListReader implements Reader {

    @Override
    public String readln() {
        List<String> myList = new ArrayList(
                Arrays.asList("Buenos Aires", "Rio De Janero", "Lima", "Calcutta"));
        return myList.get(0);
    }

}
