package org.danisanga.benchmark;

import org.danisanga.BenchmarkRunner;
import org.danisanga.algorithm.LinearSearch;
import org.danisanga.algorithm.data.BenchmarkDataSet;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
@SuppressWarnings("all")
public class LinearSearchBenchmark {
    public static void main(String[] args) throws Exception {
        BenchmarkRunner.runBenchmark(LinearSearchBenchmark.class);
    }

    @Benchmark
    public void performLinearSearch_init() {
        LinearSearch.performLinearSearch(BenchmarkDataSet.sortedGiantArray, 999);
    }

}
