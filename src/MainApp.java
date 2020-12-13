public class MainApp {
    public static void main(String[] args) {
        changeLastFirst();
        countOddEven();
        sortAscendingFirstMethod();
        sortAscendingSecondMethod();
        sortDescendingFirstMethod();
        sortDescendingSecondMethod();
    }

    public static void changeLastFirst() {
        int[] numbers = {1, 2, 3, 4, 5};

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }

    public static void countOddEven() {
        int[] numbers = {1, 3, 5, 0, 1, 2, 4, 7, 7, 8};
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                odd += 1;
            } else {
                even += 1;
            }
        }
        System.out.println("There are " + odd + " odd numbers and " + even + " even numbers.");
    }

    public static void sortAscendingFirstMethod() {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int iterationCount = 0;
        int helper;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    helper = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = helper;
                }
//// Just to visualize how algorithm works
//              visualizer(numbers);
                iterationCount += 1;
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Sorted in: " + iterationCount + " iterations");
    }

    public static void sortAscendingSecondMethod() {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int min;
        int iterationCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
//// Just to visualize how algorithm works
//              visualizer(numbers);
                iterationCount += 1;
            }
        }
        for (int number : numbers
        ) {
            System.out.println(number);
        }
        System.out.println("Sorted in: " + iterationCount + " iterations");
    }

    public static void sortDescendingFirstMethod() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int iterationCount = 0;
        int helper;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] > numbers[j]) {
                    helper = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = helper;
                }
//// Just to visualize how algorithm works
//              visualizer(numbers);
                iterationCount += 1;
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Sorted in: " + iterationCount + " iterations");
    }

    public static void sortDescendingSecondMethod() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max;
        int iterationCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
//// Just to visualize how algorithm works
//              visualizer(numbers);
                iterationCount += 1;
            }
        }
        for (int number : numbers
        ) {
            System.out.println(number);
        }
        System.out.println("Sorted in: " + iterationCount + " iterations");
    }

    public static void visualizer(int[] tab) {
        for (int number : tab) {
            System.out.println(number);
        }
        System.out.println("=======");
    }
}