package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf2 wolf = new Wolf2();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.leaveHare(hare);
        wolf.tryEat(ball);
        ball.leaveWolf(wolf);
        fox.tryEat(ball);
    }
}
