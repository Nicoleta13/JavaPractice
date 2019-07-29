package com.nicole;

import java.util.List;


public interface ISaveable {

    // two methods
    List<String> write();
    void read(List<String> savedValues);

}
