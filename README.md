# SOFTECHNOVA-ENTERPRISES
SE_JP_Task1
Java Swing Calculator – Project Description
Overview:

This project is a simple GUI-based calculator developed using Java Swing. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division, along with additional functions like square, square root, reciprocal, and decimal handling. The user interface is interactive and visually styled to enhance usability.

🔧 Features:
Basic Arithmetic Operations

Addition (+)

Subtraction (-)

Multiplication (×)

Division (/)

Advanced Functions

Square (x²)

Square Root (√x)

Reciprocal (1/x)

Decimal Point Support (.)

Input & Output

Single-line display for results and input

Supports chaining operations

Deletes last digit using DEL

Clears the screen using C

ON/OFF Toggle

Controls calculator power state

Disables/enables all buttons and input fields accordingly

Design & Usability

Clear and organized layout using JButton, JTextField, and JLabel

Font and color styling for better visibility

Error handling for divide-by-zero operations

Responsive button placement and layout

💻 Technologies Used:
Language: Java

GUI Toolkit: Java Swing (JFrame, JButton, JTextField, etc.)

Formatting: DecimalFormat for proper display of results

📂 How It Works:
Each number and operator button appends to a JTextField.

When an operator is clicked, it stores the first operand and waits for the second.

On pressing =, it performs the selected operation and displays the result.

All operations are processed using double precision.

Additional operations (like square, square root) process the current input instantly.

The calculator can be turned ON/OFF using radio buttons, which enable or disable the full interface accordingly.

📌 Future Improvements (Optional Enhancements):
Keyboard input support

Scientific calculator mode

Expression-based evaluation (e.g., 3 + 4 * 5)

Improved UI using Layout Managers or JavaFX

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

SE_JP_Task2
Java Swing Currency Converter – Project Description
Overview:

I developed a Currency Converter application using Java Swing as part of my internship project at Softechnova Enterprises. This desktop-based application allows users to easily convert amounts between multiple currencies (USD, EUR, INR, GBP) using predefined exchange rates.

The application features a simple and interactive GUI, where users can select the source and target currencies through dropdown menus, enter the amount, and instantly view the converted result. It includes proper error handling to manage invalid inputs, ensuring a smooth user experience.

🔧 Key Features:
Supports multiple currencies (USD, EUR, INR, GBP)

Simple and clean user interface using Java Swing components (JFrame, JComboBox, JTextField, JButton, JLabel)

Real-time conversion calculations

Uses HashMap to manage exchange rates efficiently

Input validation and error message pop-ups for invalid inputs

Window centered automatically for better usability

💻 Technologies Used:
Language: Java

GUI Toolkit: Swing

Data Structure: HashMap

🚀 Future Scope:
Integration of live currency exchange APIs

Addition of more currencies

Enhanced design using advanced layout managers or JavaFX

Keyboard input and shortcut key support



