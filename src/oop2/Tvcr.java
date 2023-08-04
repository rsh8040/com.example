package oop2;

class Tv2 {
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { ++channel; }
    void channelDown() {--channel; }
}

class Vcr {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}
class Tvcr extends Tv2 {
    Vcr vcr = new Vcr();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
