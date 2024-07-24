# Testing-Library-Management-System

This document provides a comprehensive guide to the test cases implemented for different classes in  `Models`, `DAO` packages and the integration tests for the Reserving and Borrowing a Book  in the LMS project. Each test case includes descriptions of test scenarios, expected outcomes, preconditions, and dependencies.


## Model Classes Tests

### Test Scenarios

1. Test Reservation Constructor with All Fields:
   - Verify that the constructor correctly initializes all fields of the Reservation object.
2. Test Reservation Constructor with Required Fields:
   - Verify that the constructor correctly initializes the Reservation object with only required fields.
3. Test Getters and Setters:
   - Verify that all getter and setter methods correctly get and set the corresponding fields.

### Expected Outcomes
1. Test Model classes Constructors with All Fields:
   - All fields should be correctly initialized.
2. Test Model classes Constructors with Required Fields:
   - Required fields should be correctly initialized.
3. Test Getters and Setters:
   - Getters should return the correct values, and setters should update the fields accordingly.
   
### Preconditions and Dependencies
   - The Model classes must be defined with the appropriate fields and methods.


## DAO Classes Tests
### Test Scenarios
1. Test Class Constructor with All Fields:
    - Verify that the constructor correctly initializes all fields of the DAO object.
2. Test Class Constructor with Required Fields:
   - Verify that the constructor correctly initializes the class object with only required fields.

### Expected Outcomes
1. Test Borrow Constructor with All Fields:
   - All fields should be correctly initialized.
2. Test Borrow Constructor with Required Fields:
   - Required fields should be correctly initialized, and the borrowDate should be set to the current date.
### Preconditions and Dependencies
   - The DAO class must be defined with the appropriate fields and methods.

## Reserve Book Integration Tests
### Test Scenarios
1. Test addButon Method:
    - Verify that a reservation is correctly added when valid input is provided.
2. Test getBookIdByName Method:
   - Verify that the correct book ID is returned when a valid book name is provided.
3. Test getUserIdByEmail Method:
   - Verify that the correct user ID is returned when a valid email is provided.
### Expected Outcomes
1. Test addButon Method:
   - A new reservation should be added, and an information alert should be displayed.
2. Test getBookIdByName Method:
   - The correct book ID should be returned.
3. Test getUserIdByEmail Method:
   - The correct user ID should be returned.
### Preconditions and Dependencies
   - Mocking frameworks like Mockito was used to mock DAO methods and JavaFX components.
   - The ReservationDAO, BookDAO, and UserDAO classes must be defined with the appropriate methods.

### Loom Demo Link: https://www.loom.com/share/912e02bd84f2470493d492d26b3af524?sid=ad90a219-54e7-4248-8fda-fb7cac06470f
