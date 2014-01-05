package com.mentor.bootstrap;

import java.io.PrintStream;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class App {

    private final Set<String> paintingElements;
    private final PrintStream printStream;

    public App(Set<String> paintingElements) {
        this(paintingElements, System.out);
    }

    public App(Set<String> paintingElements, PrintStream printStream) {
        Builder<String> builder = new ImmutableSet.Builder<String>().addAll(paintingElements);
        if (!paintingElements.contains("happy tree")) {
            builder.add("happy tree");
        }
        this.paintingElements = builder.build();
        this.printStream = printStream;
    }

    public Set<String> getPaintingElements() {
        return this.paintingElements;
    }

    public void paintPicture() {
        for (String p : paintingElements) {
            printStream.println("Now we will paint the " + p);
        }
    }

    public static void main(String[] args) {
        Set<String> paintingElements = ImmutableSet.of("sky", "lake", "mountain", "happy tree", "little squirrel");
        App bob = new App(paintingElements);
        bob.paintPicture();
    }

}
