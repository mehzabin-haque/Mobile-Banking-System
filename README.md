# Mobile Banking System with Payment Methods

This project implements a mobile banking system with different payment methods, including Nagad, Bkash, and Rocket. Each payment method is represented by a separate class extending the Account class, which defines common functionalities like adding money, cashing out, and updating PIN numbers.

## Features

### Phase 1 - User Creation, Authentication and Updating Info

In the first phase, users are created with unique PIN numbers and other necessary information, enabling them to perform transactions such as cash-in and cash-out. It also has authentication and user information update functionalities. Users can be registered, authenticated, and their information can be easily modified and updated as needed.

### Phase 2 - Payment Methods

The second phase utilizes the Nagad, Bkash, and Rocket classes to enable users to perform cash-in and cash-out transactions by choosing their preferred payment method. Each payment method class offers specific implementations, including limits on adding money, cash-out restrictions, and PIN updates.

### Bank Class

The Bank class showcases the usage of the implemented payment methods by creating instances and performing various banking operations, such as adding money, cashing out, and updating PIN numbers.

## Getting Started

To use the mobile banking system, follow these steps:

1. In Phase 1, create users with their respective PIN numbers and required information.
2. In Phase 2, choose the desired payment method (Nagad, Bkash, or Rocket) to perform cash-in and cash-out transactions.

## Conclusion

The mobile banking system simplifies transactions for users by providing different payment methods and efficient functionalities for secure banking operations. Novice programmers can gain insights into implementing payment methods through the provided classes, enhancing their understanding of C++ programming. Contributions to the project are welcome to expand its capabilities and further assist beginners in the programming journey.
