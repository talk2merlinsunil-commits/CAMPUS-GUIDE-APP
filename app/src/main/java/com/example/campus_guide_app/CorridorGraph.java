package com.example.campus_guide_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorridorGraph {

    public static Map<String, List<String>> getGraph(int floor) {

        Map<String, List<String>> graph =
                new HashMap<>();

        if (floor == 0) {

            addConnection(graph, "C1", "C2");
            addConnection(graph, "C2", "C3");
            addConnection(graph, "C3", "C4");
            addConnection(graph, "C4", "C6");
            addConnection(graph, "C6", "C5");
            addConnection(graph, "C6", "C7");
            addConnection(graph, "C7", "C8");
            addConnection(graph, "C8", "C9");
            addConnection(graph, "C9", "C10");
            addConnection(graph, "C10", "C11");
            addConnection(graph, "C11", "C12");
            addConnection(graph, "C12", "C13");
            addConnection(graph, "C12", "C14");
            addConnection(graph, "C14", "C15");
            addConnection(graph, "C15", "C16");
            addConnection(graph, "C15", "C16A");
            addConnection(graph, "C16A", "C17");
            addConnection(graph, "C17", "C18");
            addConnection(graph, "C17", "C19");
            addConnection(graph, "C19", "C20");
            addConnection(graph, "C20", "C21");
            addConnection(graph, "C20", "C22");
        }

        else if (floor == 1) {

            addConnection(graph, "C1", "C2");
            addConnection(graph, "C2", "C3");
            addConnection(graph, "C3", "C4");
            addConnection(graph, "C4", "C5");
            addConnection(graph, "C5", "C6");
            addConnection(graph, "C6", "C7");
            addConnection(graph, "C7", "C8");
            addConnection(graph, "C7", "C9");
            addConnection(graph, "C9", "C10");
            addConnection(graph, "C9", "C11");
            addConnection(graph, "C11", "C12");
            addConnection(graph, "C12", "C13");
            addConnection(graph, "C13", "C14");
            addConnection(graph, "C13", "C15");
            addConnection(graph, "C15", "C16");
            addConnection(graph, "C16", "C17");
            addConnection(graph, "C16", "C18");
            addConnection(graph, "C18", "C19");
            addConnection(graph, "C19", "C20");
            addConnection(graph, "C19", "C21");
            addConnection(graph, "C21", "C22");
            addConnection(graph, "C22", "C23");
            addConnection(graph, "C22", "C24");
        }

        else if (floor == 2 || floor == 3) {

            addConnection(graph, "C1", "C2");
            addConnection(graph, "C2", "C2A");
            addConnection(graph, "C2A", "C3");
            addConnection(graph, "C3", "C3A");
            addConnection(graph, "C3", "C4A");
            addConnection(graph, "C4A", "C4");
            addConnection(graph, "C4", "C6A");
            addConnection(graph, "C4", "C5");
            addConnection(graph, "C6A", "C6");
            addConnection(graph, "C6A", "C6B");
            addConnection(graph, "C6", "C7");
            addConnection(graph, "C7", "C7A");
            addConnection(graph, "C7A", "C8");
            addConnection(graph, "C8", "C9");
            addConnection(graph, "C8", "C8A");
            addConnection(graph, "C8A", "C10");
            addConnection(graph, "C10", "C11");
            addConnection(graph, "C10", "C10A");
            addConnection(graph, "C10A", "C12");
            addConnection(graph, "C12", "C13");
            addConnection(graph, "C12", "C14");
            addConnection(graph, "C14", "C15");
            addConnection(graph, "C15", "C16");
            addConnection(graph, "C15", "C17");
        }

        return graph;
    }

    private static void addConnection(
            Map<String, List<String>> graph,
            String a,
            String b
    ) {

        if (!graph.containsKey(a)) {
            graph.put(a, new ArrayList<>());
        }

        if (!graph.containsKey(b)) {
            graph.put(b, new ArrayList<>());
        }

        graph.get(a).add(b);
        graph.get(b).add(a);
    }
}