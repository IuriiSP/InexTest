package Task2;

import java.util.*;

public class StationTask {

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));

    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);

        System.out.println("Результаты поиска станций по префиксу \"МО\"");
        task.getStationsByTwoFirstLetters("МО").forEach(x -> System.out.println(x.getName()));
        System.out.println();
        System.out.println("Результаты поиска станций по префиксу \"СА\"");
        task.getStationsByTwoFirstLetters("СА").forEach(x -> System.out.println(x.getName()));
    }

    private StationTask(List<Station> stationList) {
        // TODO
        stationList = STATION_LIST;
    }

    private Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        // TODO
        Collections.sort(STATION_LIST, new Comparator<Station>() {
            @Override
            public int compare(Station o1, Station o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        int firstIndex = 0;
        int lastIndex = STATION_LIST.size() - 1;
        int index = -1;

        while (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            String fromLow = STATION_LIST.get(firstIndex).getName().substring(0, prefix.length());
            String fromHigh = STATION_LIST.get(lastIndex).getName().substring(0, prefix.length());
            if (fromLow.compareToIgnoreCase(prefix) < 0) {
                firstIndex = mid + 1;
            } else if (fromHigh.compareToIgnoreCase(prefix) > 0) {
                lastIndex = mid - 1;
            } else if (STATION_LIST.get(mid).getName().substring(0, prefix.length()).compareToIgnoreCase(prefix) == 0) {
                index = mid;
                break;
            }
        }

        List<Station> result = new ArrayList<>();
        int rangeStart = index++;
        int rangeEnd = index--;
        while (rangeStart > -1 && STATION_LIST.get(rangeStart).getName().toLowerCase().startsWith(prefix.toLowerCase())) {
            result.add(STATION_LIST.get(rangeStart));
            rangeStart--;
        }
        while (rangeEnd < STATION_LIST.size() && STATION_LIST.get(rangeEnd).getName().toLowerCase().startsWith(prefix.toLowerCase())) {
            result.add(STATION_LIST.get(rangeEnd));
            rangeEnd++;
        }
        return result;
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
