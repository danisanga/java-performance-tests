package org.danisanga;


import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {
    public static void runBenchmark(Class<?> clazz) throws Exception {
        final Options options = new OptionsBuilder()
                .include(clazz.getSimpleName())
                .jvmArgsAppend("-Djmh.stack.period=1")
                .build();

        new Runner(options).run();
    }
}
