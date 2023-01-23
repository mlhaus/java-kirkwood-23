## Java Kirkwood 2023

This is the work I completed for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

### Introduction

In the Introduction unit we created accounts and installed software needed for the class. 

Using [IntelliJ](https://jetbrains.com/idea) we created a module with a **Java class** inside it. Inside the class we created a main method that displays a message in the terminal. We can type "sout" followed by the tab key to generate the `System.out.println()` statement.
```java
public class MyClass {
  public static void main(String[] args) {
    System.out.println("My name is Marc!");
  }
}
```

We initialized our project as a __Git repository__ and pushed our project code to [GitHub](https://github.com). Our project includes a **.gitignore file** telling Git which files not to track.

Going forward, whenever I complete a task I will __Add-Commit-Push (ACP)__

git add .
git commit -m "describe my work"
git push origin main