package com.legion.state;

public class GameController {

    private Button currentButton;

    public void press() {
        currentButton.press();
    }

    public void release() {
        currentButton.release();
    }

    public Button getCurrentButton() {
        return currentButton;
    }

    public void setCurrentButton(Button currentButton) {
        this.currentButton = currentButton;
    }
}
