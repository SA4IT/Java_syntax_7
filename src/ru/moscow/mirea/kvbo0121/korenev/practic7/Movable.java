package ru.moscow.mirea.kvbo0121.korenev.practic7;

public interface Movable {
    void move(double x_temp, double y_temp);
    void print();
    class MovableRectangle implements Movable{
        private double x1_topLeft;
        private double y1_topLeft;
        private double x2_bottomRight;
        private double y2_bottomRight;

        public MovableRectangle(double x1_topLeft, double y1_topLeft, double x2_bottomRight, double y2_bottomRight) {
            this.x1_topLeft = x1_topLeft;
            this.y1_topLeft = y1_topLeft;
            this.x2_bottomRight = x2_bottomRight;
            this.y2_bottomRight = y2_bottomRight;
        }

        @Override
        public void move(double x_temp, double y_temp) {
            this.x1_topLeft += x_temp;
            this.x2_bottomRight += x_temp;
            this.y1_topLeft += y_temp;
            this.y2_bottomRight += y_temp;
        }

        @Override
        public void print() {
            System.out.println("Верхняя левая точка:");
            System.out.println("x1 = " + x1_topLeft +'\n'+"y1 = " + y1_topLeft);
            System.out.println("Нижняя правая точка:");
            System.out.println("x2 = " + x2_bottomRight +'\n'+"y2= " + y2_bottomRight);
        }
    }
}
