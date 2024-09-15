package org.example;

import java.util.HashMap;
import java.util.Map;

public class MontyHallStatistics {
    private final Map<Integer, GameResult> results = new HashMap<>();
    private int wins = 0;
    private int losses = 0;

    // Добавляем результат в статистику
    public void addResult(int testStep, boolean win) {
        results.put(testStep, new GameResult(testStep, win));
        if (win) {
            wins++;
        } else {
            losses++;
        }
    }

    // Выводим статистику
    public void printStatistics() {
        System.out.println("Всего игр: " + results.size());
        System.out.println("Победы: " + wins);
        System.out.println("Поражения: " + losses);
    }
}