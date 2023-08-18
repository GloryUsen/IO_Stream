package org.example;//package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Filesreader {

    public static void main(String[] args ){
        try (BufferedReader reader1 = new BufferedReader(new FileReader("output.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("Teacher.txt"))) {

            System.out.println();
            System.out.println("STUDENTS");
            String line;
            while ((line = reader1.readLine()) != null) {

                String[] data = line.split(",");



                String[] temp= new String[9];

                for(int i=0; i< data.length;i++){

                    temp[i]=data[i];

                }
                //String firstName, org.example.Role valueOf, String email, String studentId, String guardianEmail1, String guardianEmail2, String isArchieved, String isDeleted
                Student student = new Student();
                student.setStudentId(temp[7]);

                System.out.println("File 1: " + Arrays.toString(temp));
            }

            // Read file 2
            System.out.println();
            System.out.println("TEACHERS");
            while ((line = reader2.readLine()) != null) {
                // Process each line of file 2
                System.out.println("File 2: " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


















        }


}

