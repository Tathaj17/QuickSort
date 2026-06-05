# QuickSort Project

A comprehensive sorting algorithms library in Java, starting with QuickSort and expandable to other sorting techniques.

## 📚 Algorithms Implemented

- [x] QuickSort
- [ ] Merge Sort
- [ ] Heap Sort
- [ ] Bubble Sort
- [ ] Selection Sort
- [ ] Insertion Sort

## 🏗️ Project Structure

```
src/
├── algorithms/
│   ├── Sorter.java          # Base interface
│   └── QuickSort.java       # QuickSort implementation
├── utils/
│   └── ArrayUtils.java      # Utility methods for arrays
└── Main.java                # Driver/Demo class

tests/
└── SortingTest.java         # Unit tests
```

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven (optional, for build management)

### Running the Project

```bash
javac src/algorithms/*.java src/utils/*.java src/*.java
java -cp src Main
```

### Running Tests

```bash
javac -cp src tests/*.java
java -cp src:tests SortingTest
```

## 📖 Usage Examples

```java
QuickSort sorter = new QuickSort();
int[] arr = {64, 34, 25, 12, 22, 11, 90};
sorter.sort(arr);
System.out.println(Arrays.toString(arr)); // [11, 12, 22, 25, 34, 64, 90]
```

## 🔍 Algorithm Details

### QuickSort
- **Time Complexity**: O(n log n) average, O(n²) worst case
- **Space Complexity**: O(log n)
- **Type**: Divide and conquer
- **Stability**: Unstable
- **In-place**: Yes

## 📝 Contributing

To add new sorting algorithms:
1. Create a new class implementing the `Sorter` interface
2. Implement the `sort()` method
3. Add unit tests in `tests/`
4. Update this README

## 📄 License

MIT License

## 👤 Author

Tathaj17
