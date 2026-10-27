class Array {
    public static void main(String[] args) {
        int a[] = {10, -5, 20, -15, 0, 30};
        int sum = 0, even = 0, odd = 0;
        int pos = 0, neg = 0, zero = 0;
        int max = a[0], min = a[0];

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];

            if (a[i] % 2 == 0) even++;
            else odd++;

            if (a[i] > 0) pos++;
            else if (a[i] < 0) neg++;
            else zero++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum / a.length);
        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        System.out.println("Positive = " + pos);
        System.out.println("Negative = " + neg);
        System.out.println("Zeros = " + zero);

        int search = 20;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                System.out.println("Found at index " + i);
            }
        }

        System.out.print("Reverse = ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}