# 🛵 Micro Benchmarks in Java

Little project with educational purposes to test the performance of different algorithms in Java.

---

## List of supported algorithms

- **Linear Search**
- **Binary Search**
    - ****Iterative Implementation****
    - ****Recursive Implementation****
    - **Arrays.binarySearch() Implementation**
    - **Collections.binarySearch() Implementation**
- **Bubble Sort**
- **Selection Sort**
- **Insertion Sort**
---

### How it works

Run the following Gradle task to run the benchmarks:

```bash
./gradlew jmh
```

Check the results in *build/results/jmh/results.txt*.

---

### Tasks

- [ ]  Add more algorithms.
- [ ]  Add some comments, Javadocs, etc.

---

### Resources

JMH library, https://github.com/openjdk/jmh

Gradle plugin, https://github.com/melix/jmh-gradle-plugin
