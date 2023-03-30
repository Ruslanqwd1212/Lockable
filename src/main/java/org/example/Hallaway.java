package org.example;



public class Hallaway implements Room{
    @Override
    public void clean(Robot robot) {
        System.out.println("Робот убирает прихожую");
        robot.addTime(5);
    }

    @Override
    public String getName() {
        return "прихожей";
    }
}