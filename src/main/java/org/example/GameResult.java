package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //генерация конструктора, а также гетеров и сетеров для полей класса
public class GameResult {
    private int testStep;
    private boolean win;

}
