package org.example;

import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getExperience() != o2.getExperience()) {
            if (o1.getExperience() > o2.getExperience()) {
                return -1;
            } else if (o1.getExperience() < o2.getExperience()) {
                return 1;
            }
        }
        int cnt1 = getSumS(o1.getName());
        int cnt2 = getSumS(o2.getName());
        if (cnt1 != cnt2) {
            return -Integer.compare(cnt1, cnt2);
        }
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }

    public int countSletters(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 's' || name.charAt(i) == 'S') {
                count++;
            }
        }
        return count;
    }


    public int getSumS(String s) {
        int sum = 0;
        if (s.equals(null)) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's' || s.charAt(i) == 'S') {
                sum++;
            }
        }
        return sum;
    }

}
