package com.example.campus_guide_app;

import java.util.*;

public class PathFinder {

    public static List<String> findPath(
            String start,
            String end,
            int floor
    ) {

        Map<String, List<String>> graph =
                CorridorGraph.getGraph(floor);

        Queue<String> queue =
                new LinkedList<>();

        Map<String, String> previous =
                new HashMap<>();

        Set<String> visited =
                new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            String current =
                    queue.poll();

            if (current.equals(end)) {
                break;
            }

            for (String neighbor :
                    graph.getOrDefault(
                            current,
                            new ArrayList<>()
                    )) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);

                    previous.put(
                            neighbor,
                            current
                    );

                    queue.add(neighbor);
                }
            }
        }

        List<String> path =
                new ArrayList<>();

        String current = end;

        while (current != null) {

            path.add(0, current);

            current =
                    previous.get(current);
        }

        return path;
    }
}