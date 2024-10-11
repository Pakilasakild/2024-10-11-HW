public class Main {

    public static void selectionSort(String[] names, int[] grades, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (grades[j] < grades[minIndex]) {
                    minIndex = j;
                }
            }
            int tempGrade = grades[i];
            grades[i] = grades[minIndex];
            grades[minIndex] = tempGrade;

            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        String names[] = {"Alice", "Bob", "Charlie", "David", "Eva"};
        int grades[] = {85, 92, 78, 88, 95};

        selectionSort(names, grades, n);

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }
}
