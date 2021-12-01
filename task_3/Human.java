package ru.mirea.task3;

public class Human {
    static class Head{
        private String hair_color = "black";
        private String eyes_color = "green";

        Head(){}
        Head(String hair_color, String eyes_color){
            this.hair_color = hair_color;
            this.eyes_color = eyes_color;
        }

        public void setHair_color(String hair_color) { this.hair_color = hair_color; }
        public String getHair_color() { return hair_color; }

        public void setEyes_color(String eyes_color) { this.eyes_color = eyes_color; }
        public String getEyes_color() { return eyes_color; }

        @Override
        public String toString() {
            return "Head{" +
                    "hair_color='" + hair_color + '\'' +
                    ", eyes_color='" + eyes_color + '\'' +
                    '}';
        }
    }

    static class Leg{
        private int state = 0;

        Leg(){}
        Leg(int state) { this.state = state; }

        public void setState(int state) { this.state = state; }
        public int getState() { return state; }

        @Override
        public String toString() {
            if (state == 0)
                return "Прямое положение";
            else if (state == 1)
                return "Согнутое положение";
            else return "None";
        }
    }

    static class Hand{
        private int state = 0;

        Hand(){}
        Hand(int state) { this.state = state; }

        public void setState(int state) { this.state = state; }
        public int getState() { return state; }

        @Override
        public String toString() {
            if (state == 0)
                return "Прямое положение";
            else if (state == 1)
                return "Согнутое положение";
            else return "None";
        }
    }

    private int x=0, y=0;
    Head head;
    Leg leg_left;
    Leg leg_right;
    Hand hand_left;
    Hand hand_right;


    Human()
    {
        head = new Head();
        leg_left = new Leg();
        leg_right = new Leg();
        hand_left = new Hand();
        hand_right = new Hand();
    }
    Human(int x, int y) {
        this.x = x; this.y = y;
        head = new Head();
        leg_left = new Leg();
        leg_right = new Leg();
        hand_left = new Hand();
        hand_right = new Hand();
    }
    Human(int x, int y, String hair_color, String eyes_color,
          int hand_left_state, int hand_right_state, int leg_left_state, int leg_right_state)
    {
        this.x = x;
        this.y = y;
        head = new Head(hair_color, eyes_color);
        leg_left = new Leg(leg_left_state);
        leg_right = new Leg(leg_right_state);
        hand_left = new Hand(hand_left_state);
        hand_right = new Hand(hand_right_state);
    }

    public void setXY(int x, int y) { this.x = x; this.y = y; }

    public void move(int xSpeed, int ySpeed) { x += xSpeed; y += ySpeed; }

    @Override
    public String toString() {
        return "Human{" +
                "x=" + x +
                ", y=" + y +
                ", head=" + head +
                ", leg_left=" + leg_left +
                ", leg_right=" + leg_right +
                ", hand_left=" + hand_left +
                ", hand_right=" + hand_right +
                '}';
    }
}
