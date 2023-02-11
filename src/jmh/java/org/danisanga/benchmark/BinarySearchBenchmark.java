package org.danisanga.benchmark;

import org.danisanga.BenchmarkRunner;
import org.danisanga.algorithm.searching.BinarySearch;
import org.danisanga.algorithm.data.BenchmarkDataSet;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
@SuppressWarnings("all")
public class BinarySearchBenchmark {
    public static void main(String[] args) throws Exception {
        BenchmarkRunner.runBenchmark(BinarySearchBenchmark.class);
    }

    @Benchmark
    public void performBinarySearchIteratively_init() {
        int low = 0;
        int high = BenchmarkDataSet.sortedGiantArray.length;

        BinarySearch.performBinarySearchIteratively(BenchmarkDataSet.sortedGiantArray, 999, low, high);
    }

    @Benchmark
    public void performBinarySearchRecursively_init() {
        int low = 0;
        int high = BenchmarkDataSet.sortedGiantArray.length;

        BinarySearch.performBinarySearchRecursively(BenchmarkDataSet.sortedGiantArray, 999, low, high);
    }

    @Benchmark
    public void performBinarySearchWithArraysFunction_init() {
        BinarySearch.performBinarySearchWithArraysFunction(BenchmarkDataSet.sortedGiantArray, 999);
    }

    @Benchmark
    public void performBinarySearchWithCollectionsFunction_init() {
        BinarySearch.performBinarySearchWithCollectionsFunction(BenchmarkDataSet.sortedGiantCollection, 999);
    }

}
