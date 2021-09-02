package com.legion.state;

public class Main {

    public static void main(String[] args) {

        GameController controller = new GameController();
        /**
         * Using polymorphism
         */
        controller.setCurrentButton(new UpButton());
        controller.press();
        controller.release();

        controller.setCurrentButton(new SquareButton());
        controller.press();
        controller.release();

        controller.setCurrentButton(new TriangleButton());
        controller.press();
        controller.release();

        controller.setCurrentButton(new DownButton());
        controller.press();
        controller.release();
    }
}
