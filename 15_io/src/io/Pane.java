package io;

import java.util.HashMap;

import javax.swing.JPanel;

public interface Pane <E,T>{
    public JPanel getPane();
    public HashMap<E, T> getComp();
}
