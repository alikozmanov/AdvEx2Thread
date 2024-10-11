package fr.fms.thread; // 2.1

public class AdvEx2Thread extends Thread {

    public AdvEx2Thread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(this.getName());
        }
    }

    public static void main(String[] args) {
        AdvEx2Thread t = new AdvEx2Thread("1- 1- 1- 1- 1-");
        AdvEx2Thread t2 = new AdvEx2Thread("5----- 5----- 5----- 5----- 4---- 4---- 4---- 2-- 2-- 2-- 2-- 2--");
        AdvEx2Thread t3 = new AdvEx2Thread("3--- 3--- 3--- 3--- 3---");
        AdvEx2Thread t4 = new AdvEx2Thread("4---- 4----");
        AdvEx2Thread t5 = new AdvEx2Thread("5-----");

        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

// Lorsqu’on relance le programme, le résultat diffère, pourquoi ?

// Lorsque j'appelles la méthode start(), cela ne garantit pas que les threads s'exécuteront dans un ordre précis. 
// Cela demande simplement à la JVM de lancer les threads en même temps