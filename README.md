1. Есть библиотека, версии которой представлены в виде "1.2.3", "2.4.31" и т. д.
Т.е. версия состоит из трех чисел, разделенных точками:
- Первое число - глобальные изменения.
- Второе число - минорные изменения.
- Третье число - исправление багов.
Нужно написать метод, который на вход принимает массив строк с версиями, а на выходе
отдает отсортированные версии, от самой ранней к более поздней.

Решение: 
1.Преобразовть массив строк в лист с массивами чисел. 
2. Создать класс с тремя полями major, minor, maintance
3. создать компаратор для сравнения по трем показателям

2. Есть список станций, который мы загружаем при инициализации класса.
У каждой станции есть уникальное название.
Когда пользователь вводит первые 2 буквы названия станции, мы должны вывести ему список подходящих станций.
Для этого нужно реализовать метод getStationsByTwoFirstLetters.
Таких станций и запросов очень много, поэтому вариант с перебором всех станций по каждому запросу не подходит.
Нужно найти оптимальное решение по производительности.

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StationTask {

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));
    
    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);
        System.out.println(task.getStationsByTwoFirstLetters("МО"));
        System.out.println(task.getStationsByTwoFirstLetters("СА"));
    }
    
    private StationTask(List<Station> stationList) {
        // TODO
    }
    
    private Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        // TODO
        return null;
    }

    private static class Station {
        
        private String name;
        
        public Station(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }        
    }
}

 
3. Сумма чисел
На вход программе подается массив чисел (возможны повторения).
Программа должна посчитать оптимальным по быстродействию способом уникальные суммы пар чисел из этого массива и вывести их список (если сумма встречается больше одного раза, то ее не должно быть в ответе).
