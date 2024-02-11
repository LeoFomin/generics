package com.car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actions actions = new Actions();
        List<Car> cars2 = actions.read("C:\\Users\\1\\IdeaProjects\\car-project\\src\\com\\car\\resources\\data.txt");
        List<Bus> buses2 = actions.read("C:\\Users\\1\\IdeaProjects\\car-project\\src\\com\\car\\resources\\databuses.txt");

        actions.sameColorCount(cars2, "black");
        actions.sortByName(cars2);

        actions.sameColorCount(buses2, "black");
        actions.sortByName(buses2);

    }
}