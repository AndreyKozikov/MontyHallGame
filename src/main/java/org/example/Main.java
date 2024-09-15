package org.example;

public class Main {
    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();
        MontyHallStatistics statistics = new MontyHallStatistics();

        int numberOfTests = 1000;
        boolean switchDoor = true; // Пример стратегии: всегда менять дверь

        for (int i = 1; i <= numberOfTests; i++) {
            boolean win = game.play(switchDoor);
            statistics.addResult(i, win);
        }

        // Выводим результаты
        statistics.printStatistics();
    }
}