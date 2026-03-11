# Network Intrusion Detection System (Java)

## Project Description

This is a simple Network Intrusion Detection System built using Java.
The program reads a network log file and checks for suspicious activities such as repeated failed login attempts or too many requests coming from the same IP address.

The main idea of this project is to understand how basic intrusion detection techniques can be implemented using Java and simple log analysis.


## Features

* Reads network log data from a file
* Detects repeated failed login attempts
* Identifies suspicious activity from the same IP address
* Displays warning and alert messages in the terminal


## Technologies Used

* Java
* File Handling
* HashMap (Java Data Structures)


## Project Files

*IntrusionDetectionSystem.java*
Main program that starts the intrusion detection process.

*LogMonitor.java*
Contains the logic for reading and analyzing the log file.

*network_log.txt*
Sample log file used to test the program.


## How to Run the Project

1. Open the project folder in your IDE or terminal.

2. Compile the Java files

javac *.java

3. Run the main program

java IntrusionDetectionSystem

4. When the program asks for the log file path, enter

network_log.txt


## Sample Log File Format

Example of the log file used in this project:

192.168.1.10,LOGIN_SUCCESS
192.168.1.10,FAILED_LOGIN
192.168.1.10,FAILED_LOGIN
192.168.1.10,FAILED_LOGIN
192.168.1.10,FAILED_LOGIN
192.168.1.10,FAILED_LOGIN
10.0.0.5,LOGIN_SUCCESS

## Example Output

Network Intrusion Detection System
ALERT: Suspicious activity detected from IP: 192.168.1.10
Warning: Multiple failed login attempts from 192.168.1.10
Log analysis completed.


## Future Improvements

* Add real-time log monitoring
* Detect port scanning attempts
* Generate a detailed threat report
