package com.cycrilabs.test;

import io.quarkus.logging.Log;
import picocli.CommandLine;

@CommandLine.Command
public class HelloCommand implements Runnable {
    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;

    @Override
    public void run() {
        Log.infof("Hello %s!", name);
    }
}
