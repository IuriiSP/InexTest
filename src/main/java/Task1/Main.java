package Task1;

import Task1.Services.VersionsService;

public class Main {
    public static void main(String[] args) {
        String[] versionsArr = {"1.2.30", "2.4.31", "1.2.31", "2.4.30", "3.1.9", "3.1.0", "2.3.1", "1.0.0", "1.2.29"};
        VersionsService numberService = new VersionsService();
        System.out.println(numberService.getSortedVersions(versionsArr));
    }
}
