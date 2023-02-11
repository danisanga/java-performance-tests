package org.danisanga.benchmark;

import org.danisanga.BenchmarkRunner;
import org.danisanga.algorithm.data.BenchmarkDataSet;
import org.danisanga.algorithm.sorting.BubbleSort;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
@SuppressWarnings("all")
public class BubbleSortBenchmark {

    public static void main(String[] args) throws Exception {
        BenchmarkRunner.runBenchmark(BubbleSortBenchmark.class);
    }

    @Benchmark
    public void performBubbleSort_init() {
        BubbleSort.performBubbleSort(BenchmarkDataSet.unsortedArray);
    }
}
