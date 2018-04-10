package at.bytefactory.onestopreportuser;

import java.util.ArrayList;

/**
 * Created by Moritz Reis on 10.04.2018.
 */

public class Category {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    private boolean selected;


}
