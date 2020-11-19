package ru.geekbrains.homework22;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j + "";
            }
        }
        System.out.println(checkArray(array));
    }

    static int checkArray(String array[][]) {
        int arraySum = 0;
        if (array.length != 4) {
            throw new MySizeArrayException("Error array length! [x] [ ]");
        }
        if (array[0].length != 4) {
            throw new MySizeArrayException("Error array length! [ ] [x]");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    arraySum += (Integer.parseInt(array[i][j]));
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно преобразовать данные по адресу: " + i + ": " + j);
                }
            }
        }
        return arraySum;
    }
}
