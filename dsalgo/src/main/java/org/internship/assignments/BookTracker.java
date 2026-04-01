package org.internship.assignments;

import java.util.Map;

public class BookTracker {

    public String nearestChapter(Map<String, Integer> chapters, int currentPage) {
        String nearestChapter = "";
        int minDistance = Integer.MAX_VALUE;
        int maxPageOfNearest = -1;

        System.out.println("minDistance : "+minDistance);

        for (Map.Entry<String, Integer> entry : chapters.entrySet()) {
            String chapterName = entry.getKey();
            int chapterPage = entry.getValue();
            int currentDistance = Math.abs(currentPage - chapterPage);

            // Logic: If closer OR if distance is equal but page number is higher
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                nearestChapter = chapterName;
                maxPageOfNearest = chapterPage;
            } else if (currentDistance == minDistance) {
                if (chapterPage > maxPageOfNearest) {
                    nearestChapter = chapterName;
                    maxPageOfNearest = chapterPage;
                }
            }
        }

//        chapters.entrySet().stream().forEach(stringIntegerEntry -> {
//
//        });


        return nearestChapter;
    }
}