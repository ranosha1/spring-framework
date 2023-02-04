package java;

public class Apple {

        private int weigth;
        private Color color;

        public Apple(int weigth, Color color) {
            this.weigth = weigth;
            this.color = color;
        }

        public int getWeigth() {
            return weigth;
        }

        public Color getColor() {
            return color;
        }

        public void setWeigth(int weigth) {
            this.weigth = weigth;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weigth=" + weigth +
                    ", color=" + color +
                    '}';
        }
    }


