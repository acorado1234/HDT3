package uvg.edu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import uvg.edu.controller.IComparator;
import uvg.edu.controller.Sort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        try (FileWriter writer = new FileWriter("numbers.csv")) {
            for (int number : numbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer[] numbersForSort = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersForSort[i] = numbers[i];
        }

        IComparator<Integer> comparator = new IComparator<>() {
            @Override
            public int Compare(Integer _object1, Integer _object2) {
                return _object1.compareTo(_object2);
            }
        };

        Sort<Integer> sort = new Sort<>(comparator);

        // Timing for Insertion Sort
        long startTime = System.nanoTime();
        sort.insertionSort(numbersForSort.clone());
        long endTime = System.nanoTime();
        System.out.println("Insertion Sort completed in " + (endTime - startTime) + " nanoseconds");

        // Timing for Merge Sort
        startTime = System.nanoTime();
        sort.mergeSort(numbersForSort.clone());
        endTime = System.nanoTime();
        System.out.println("Merge Sort completed in " + (endTime - startTime) + " nanoseconds");

        // Timing for Quick Sort
        startTime = System.nanoTime();
        sort.quickSort(numbersForSort.clone());
        endTime = System.nanoTime();
        System.out.println("Quick Sort completed in " + (endTime - startTime) + " nanoseconds");

        // Timing for Radix Sort
        startTime = System.nanoTime();
        sort.radixSort(numbers.clone());
        endTime = System.nanoTime();
        System.out.println("Radix Sort completed in " + (endTime - startTime) + " nanoseconds");

        // Timing for Bucket Sort
        float[] floatNumbers = new float[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            floatNumbers[i] = numbers[i] / 10000.0f;
        }
        startTime = System.nanoTime();
        sort.bucketSort(floatNumbers);
        endTime = System.nanoTime();
        System.out.println("Bucket Sort completed in " + (endTime - startTime) + " nanoseconds");

        // Timing for Shell Sort
        startTime = System.nanoTime();
        sort.shellSort(numbersForSort.clone());
        endTime = System.nanoTime();
        System.out.println("Shell Sort completed in " + (endTime - startTime) + " nanoseconds");
    }
}