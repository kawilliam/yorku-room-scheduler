package com.yorku.roomscheduler.dao;

import com.yorku.roomscheduler.model.Payment;
import com.yorku.roomscheduler.model.enums.PaymentMethod;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Payment operations
 */
public class PaymentDAO {
    
    private static final String CSV_FILE = "src/main/resources/data/payments.csv";
    private static final String[] HEADERS = {"paymentId", "bookingId", "amount", "method", "status", "timestamp"};
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    
    public PaymentDAO() {
        initializeCSVFile();
    }
    
    private void initializeCSVFile() {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
                    writer.writeNext(HEADERS);
                }
                System.out.println("Created payments.csv with headers");
            } catch (IOException e) {
                System.err.println("Error creating payments.csv: " + e.getMessage());
            }
        }
    }
    
    public boolean savePayment(Payment payment) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE, true))) {
            String[] record = {
                payment.getPaymentId(),
                payment.getBookingId(),
                String.valueOf(payment.getAmount()),
                payment.getMethod().name(),
                payment.getStatus(),
                LocalDateTime.now().format(formatter)
            };
            writer.writeNext(record);
            return true;
        } catch (IOException e) {
            System.err.println("Error saving payment: " + e.getMessage());
            return false;
        }
    }
    
    public List<Payment> getPaymentsByBooking(String bookingId) {
        List<Payment> payments = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equals(bookingId)) {
                    Payment payment = reconstructPayment(line);
                    if (payment != null) {
                        payments.add(payment);
                    }
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading payments: " + e.getMessage());
        }
        return payments;
    }
    
    public List<Payment> getAllPayments() {
        List<Payment> payments = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            reader.readNext(); // Skip headers
            String[] line;
            while ((line = reader.readNext()) != null) {
                Payment payment = reconstructPayment(line);
                if (payment != null) {
                    payments.add(payment);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error reading payments: " + e.getMessage());
        }
        return payments;
    }
    
    private Payment reconstructPayment(String[] line) {
        try {
            String paymentId = line[0];
            String bookingId = line[1];
            double amount = Double.parseDouble(line[2]);
            PaymentMethod method = PaymentMethod.valueOf(line[3]);
            
            Payment payment = new Payment(paymentId, bookingId, amount, method);
            return payment;
        } catch (Exception e) {
            System.err.println("Error reconstructing payment: " + e.getMessage());
            return null;
        }
    }
}