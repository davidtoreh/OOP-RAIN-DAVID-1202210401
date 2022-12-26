public class Calculation implements Runnable{
    
    double radius;
    double side;
    double area;
    static double phi = 3.14;

    public Calculation(double radius, double side, double area){
        this.radius = radius;
        this.side = side;
        this.area = area;
    }

    @Override
    public void run(){
        for(int i=3; i <= 3 ; i++){
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void setSquare(){
        luas = side * side;
    }

    public void getSquare(){
        return luas(area);
    }

    public void setCircle(){
        luas = phi*radius;
    }

    public void getCircle(){
        return luas(area);
    }

    public void setTrapezoid(double a, double b, double t){
        luas = (a*t) / 2;
    }

    public void getTrapezoid(){
        return luas(area);
    }

}