package com.travel.travellingbug.Model;

public class LanguageSelectorModel {
    boolean radioButton;

    public LanguageSelectorModel(boolean radioButton) {
        this.radioButton = radioButton;
    }

    public boolean isRadioButton() {
        return radioButton;
    }

    public void setRadioButton(boolean radioButton) {
        this.radioButton = radioButton;
    }
}
