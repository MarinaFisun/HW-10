public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
        public static void task1() {
            System.out.println("Task 1");
            int[] salaryArray = generateRandomArray();
            int salarySum = 0;
            for (int salary : salaryArray) {
                salarySum = salarySum + salary;
            }
            System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
        }
        public static void task2() {
            System.out.println("Task 2");
            int[] salaryArray = generateRandomArray();
            int minAmount = salaryArray[0];
            int maxAmount = salaryArray[0];
            for (int salary : salaryArray) {
                if (salary < minAmount) {
                    minAmount = salary;
                }

                if (salary > maxAmount) {
                    minAmount = salary;
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей." + "Максимальная сумма трат за день составила " + maxAmount + " рублей.");
        }
    }
