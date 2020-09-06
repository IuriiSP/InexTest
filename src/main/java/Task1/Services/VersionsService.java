package Task1.Services;

import Task1.Pojo.Version;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VersionsService {

    public List<Version> getSortedVersions(String[] versionsArr) {
        return sortVersions(parseVersionsArrayToList(versionsArr));
    }

    private List<Version> parseVersionsArrayToList(String[] versionsArr) {
        List<Version> versionList = new ArrayList<>();
        for (String a : versionsArr) {
            String[] str = a.split("\\.");
            versionList.add(new Version(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }
        return versionList;
    }

    private List<Version> sortVersions(List<Version> versionList) {
        Comparator<Version> versionComparator = new VersionMajorComparator().
                thenComparing(new VersionMinorComparator()).thenComparing(new VersionMaintenanceComparator());
        versionList.sort(versionComparator);
        return versionList;
    }
}
