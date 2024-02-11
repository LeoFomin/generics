package com.car;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Actions<T extends Auto> {


    public void sameColorCount(List<T> cars, String color) {
        System.out.println(cars.stream().filter(t -> t.color.equals(color)).count());
    }

    public void sortByName(List<T> cars) {
        Comparator<T> b = Comparator.comparing(T::getMaxSpeed).reversed();
        cars.sort(Comparator.comparing(T::getName).thenComparing(b));
        cars.forEach(T::carInfo);
    }

    public List<T> read(String path) {

        List<T> empList = null;
        try {
            File f1 = new File(path);
            Scanner scanner = new Scanner(f1);
            empList = new ArrayList<T>();
            while (scanner.hasNextLine()) {
                String data[] = scanner.nextLine().split(",");
                if (data.length == 4) {
                    empList.add((T) new Car(data[0], data[1], Integer.parseInt(data[2]), data[3]));
                }
                if (data.length == 6) {
                    empList.add((T) new Bus(data[0], data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5])));
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empList;
    }
}

