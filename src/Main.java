public class Main {
    public static void main(String[] args) {
        task1();
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
    }
