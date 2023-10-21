package ba.unsa.etf.rpr;
import java.util.Scanner;

class Sat{
    int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde){
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    };
    void Postavi(int s, int m, int sec){
        sati=s;
        minute=m;
        sekunde=sec;
    }
    void Sljedeci(){
        sekunde++;
        if(sekunde==60){
            sekunde=0;minute++;
        }

        if(minute==60){
            minute=0;sati++;
        }
        if(sati==24)sati=0;
    }
    void Prethodni(){
        sekunde--;
        if(sekunde==-1){
            sekunde=59;minute--;
        }
        if(minute==-1){
            minute=59;sati--;
        }
        if(sati==-1)sati=23;
    }
    void PomjeriZa(int p){
        if(p>0) {
            for (int i=0; i < p; i++) Sljedeci();
        }
        else {
            for(int i=0;i<-p;i++)Prethodni();
        }
    }
    public int DajSate(){
        return sati;
    }
    public int DajMinute(){
        return minute;
    }
    public int DajSekunde(){
        return sekunde;
    }
    public void Ispisi(){
        System.out.println("Sati: "+sati+"  Minute: "+minute+"  Sekunde: "+sekunde);
    }
}

public class Main {

    public static void main(String[] args) {
	Sat s=new Sat(15,30,45);
    s.Ispisi();
    s.Sljedeci();
    s.Ispisi();
    s.PomjeriZa(-48);
    s.Ispisi();
    s.Postavi(0,0,0);
    s.Ispisi();
    }
}
