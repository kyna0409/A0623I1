package _06_inheritance.exercise.e3_point_moveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed ,ySpeed ;
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed)
    {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint()
    {
        this.xSpeed =0.0f;
        this.ySpeed =0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed()
    {
        return new float[]{xSpeed,ySpeed};
    }
    public MoveablePoint move()
    {
        super.setX(super.getX()+getxSpeed());
        super.setY(super.getY()+getySpeed());
        return this;
    }
    @Override
    public String toString() {
        return super.toString()+", "+"speed=("+getxSpeed()+","+getySpeed()+")";
    }

}
