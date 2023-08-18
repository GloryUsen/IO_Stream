package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherWriter {

    public static void main(String[] args) {
        try {
            BufferedWriter teachWrite = new BufferedWriter(new FileWriter("Teacher.txt"));

            teachWrite.write("TeacherID,Email,FirstName,LastName,GradeLevel\n" +
                    "gregory01,ogregory+teacher+academy@chalk.com,Oliver,Gregory,2\n" +
                    "lloyd01,slloyd+teacher+academy@chalk.com,Shelley,Lloyd,1\n" +
                    "osbourne01,lsobourne+teacher+academy@chalk.com,Lee,Osbourne,1\n" +
                    "walton01,jwalton+teacher+academy@chalk.com,Joesphine,Walton,3\n" +
                    "fernandez01,ifernandez+support+teacher+academy@chalk.com,Inez,Fernandez,4\n");
            teachWrite.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
