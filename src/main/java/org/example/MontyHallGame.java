package org.example;

import lombok.Data;
import java.util.Random;

@Data
public class MontyHallGame {
    private final Random random = new Random();

    // Метод для запуска игры: возвращает true, если игрок выиграл
    public boolean play(boolean switchDoor) {
        // Задаем двери: одна из них содержит машину (выигрыш)
        int winningDoor = random.nextInt(3);
        int playerChoice = random.nextInt(3);

        // Ведущий открывает одну из оставшихся дверей, за которой нет приза
        int openedDoor = openOtherDoor(winningDoor, playerChoice);

        // Если игрок решает поменять выбор
        if (switchDoor) {
            playerChoice = switchDoor(playerChoice, openedDoor);
        }

        // Возвращаем результат игры: true, если игрок выиграл машину
        return playerChoice == winningDoor;
    }

    // Метод для открытия двери ведущим
    private int openOtherDoor(int winningDoor, int playerChoice) {
        for (int door = 0; door < 3; door++) {
            if (door != playerChoice && door != winningDoor) {
                return door;
            }
        }
        throw new IllegalStateException("Не удалось открыть дверь.");
    }

    // Метод для смены выбора двери
    private int switchDoor(int playerChoice, int openedDoor) {
        for (int door = 0; door < 3; door++) {
            if (door != playerChoice && door != openedDoor) {
                return door;
            }
        }
        throw new IllegalStateException("Не удалось сменить дверь.");
    }
}
