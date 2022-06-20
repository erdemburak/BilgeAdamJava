package com.bilgeadam.dosyalar;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DosyaIslemleri {

    private static void dosyaOku() throws Exception {
        File file = new File("files/deneme.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    }

    private static void dosyaTasi() throws Exception{
        Path kaynak = Paths.get("files/repo/deneme.txt");
        Path hedef = Paths.get("files/deneme.txt");

        Files.move(kaynak,hedef, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("İşlem yapıldı.");
    }

    public static void main(String[] args) throws Exception {
        dosyaTasi();
    }

}
