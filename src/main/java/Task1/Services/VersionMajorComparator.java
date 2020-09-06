package Task1.Services;

import Task1.Pojo.Version;

import java.util.Comparator;

public class VersionMajorComparator implements Comparator<Version> {
    @Override
    public int compare(Version o1, Version o2) {
        return o1.getMajor() - o2.getMajor();
    }
}
