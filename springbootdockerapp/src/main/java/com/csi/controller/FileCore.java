package com.csi.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCore {
    public static void main(String[] args) {
        File f1 = new File("D://aaa.txt");

       f1.delete();

        System.out.println("deleted");


    }
}
