package com.javabycode.springboot;

public class ComplexCodeExample {
    // Hard-coded values
    private static final int MAX_RETRIES = 3;
    private static final String API_URL = "http://example.com/api";

    // Poor naming conventions
    private int a;
    private String b;

    // Lack of comments
    public ComplexCodeExample() {
        a = 0;
        b = "default";
    }

    // Inefficient algorithm
    public int inefficientSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    sum += numbers[i];
                }
            }
        }
        return sum;
    }

    // Improper exception handling
    public void fetchData() {
        try {
            // Simulate API call
            String response = callApi(API_URL);
            System.out.println("API Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method with too many responsibilities
    public void processAndSaveData(String data) {
        // Process data
        String processedData = data.trim().toUpperCase();

        // Save data
        saveToDatabase(processedData);
    }

    // Unused method
    public void unusedMethod() {
        System.out.println("This method is not used anywhere.");
    }

    // Method with hard-coded values
    private String callApi(String url) throws Exception {
        if (url.equals(API_URL)) {
            return "Success";
        } else {
            throw new Exception("Invalid URL");
        }
    }

    // Method with poor exception handling
    private void saveToDatabase(String data) {
        try {
            // Simulate database save
            if (data.isEmpty()) {
                throw new Exception("Data is empty");
            }
            System.out.println("Data saved: " + data);
        } catch (Exception e) {
            System.out.println("Failed to save data");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ComplexCodeExample example = new ComplexCodeExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + example.inefficientSum(numbers));
        example.fetchData();
        example.processAndSaveData("  test data  ");
    }
}