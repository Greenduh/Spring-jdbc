package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        var jdbcTemplate = context.getBean("jdbcTemplate", org.springframework.jdbc.core.JdbcTemplate.class);
        CustomerDao customerDao = new CustomerDaoImpl(jdbcTemplate);

        // Додати
        Customer customer1 = new Customer("Іван", "ivan@gmail.com", "123-45-6789");
        customerDao.addCustomer(customer1);
        Customer customer2 = new Customer("Микита", "mykyta@gmail.com", "111-22-3333");
        customerDao.addCustomer(customer2);

        // Отримати всі
        List<Customer> all = customerDao.getAllCustomers();
        all.forEach(System.out::println);

        // Отримати по ID
        Customer found = customerDao.getCustomerById(1);
        System.out.println("Знайдено: " + found);

        // Оновити
        found.setEmail("updated@example.com");
        customerDao.updateCustomer(found);

        // Видалити
        customerDao.deleteCustomer(1);
    }
}
