package PCE.Assignment;

public class Student_Marks_Analyzer {
    public static int Total(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for (int ele : arr) {
            sum += ele;
        }
        double avg = Average(sum, n);
        Result(avg);
        return sum;
    }
    public static double Average(int sum, int n) {
        double avg = (double) sum / n;
        
        System.out.println("Average: " + avg);
        return avg;
    }
    public static void Result(double avg) {
        if (avg >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
    public static void main(String[] args) {
        String studentName = "Mayur";
        int arr[] = {80, 40, 50, 60, 70, 80, 90};
        System.out.println("Student: " + studentName);
        System.out.println("Total: " + Total(arr));
    }
}

