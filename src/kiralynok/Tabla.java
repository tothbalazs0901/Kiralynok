package kiralynok;
//1. feladat

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tabla {
    //2. feladat
    private char[][] T;
    private char uresCella;
    
    //3. feladat kstr. létrehozása
    //3.b paraméterezni kell a kstr-t
    public Tabla(char uresCella){
        //3.a
        T = new char[8][8];
        //3.b
        this.uresCella = uresCella;
        //3.c
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }
    
    //4. feladathoz, de a main-ben kell meghívni
    public void megjelenit(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    //5. feladat
    public void elhelyez(int N){
        int db = 0;
        while(db<N){
            int sor = (int)(Math.random()*8);
            int oszl = (int)(Math.random()*8);
            if(T[sor][oszl] != 'K'){
                T[sor][oszl] = 'K';
                db++;
            }
        }
    }
    
    //7. feladat
    public boolean uresOszlop(int oszlop){
        //eldöntés tétele
        int i = 0;
        while(i < 8 && !(T[i][oszlop] == 'K')){
            i++;
        }
        return i >= 8;
    }
    
    public boolean uresSor(int sor){
        //eldöntés tétele
        int i = 0;
        while(i < 8 && !(T[sor][i] == 'K')){
            i++;
        }
        return i >= 8;
    }
    
    //8. feladat lekérdezés, tehát getUresSorokSzama, de a feladat más nevet adott meg
    public int uresSorokSzama(){
        //megszámolás tétele
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if(uresSor(i)){
                db++;
            }
        }
        return db;
    }
    
    public int uresOszlopokSzama(){
        //megszámolás tétele
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if(uresOszlop(i)){
                db++;
            }
        }
        return db;
    }
    
}
