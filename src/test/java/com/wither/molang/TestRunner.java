package com.wither.molang;

import com.wither.molang.tests.MathTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class TestRunner {
    public static final String GREEN = "\033[0;32m";
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathTests.class);
        List<Failure> failures = result.getFailures();
        if (failures.size() > 0) {
            for (Failure failure : failures) {
                System.out.println(RED + failure.toString() + RESET);
            }
            System.out.println(RED + "Tests completed with errors :(" + RESET);
        }
        else {
            System.out.println(GREEN + "Tests completed successfully!" + RESET);
        }
    }
}
