package A;

/**
 * Created by sity on 27/10/2019.
 */
public class Rectangle {
    private float lenght;
    private float width;
    public Rectangle (float lenght , float width){
        this.lenght=lenght;
        this.width=width;
    }
    public Rectangle(){
        this.lenght=1;
        this.width=1;
    }
    public float getlenght (){
        return this.lenght;
    }
    public void setLenght(float lenght){
        if (0.0 <= lenght && lenght<= 20.0)
        this.lenght=lenght;
    }
    public float getWidth(){return this.width;
    }
    public void setWidth(){
        if (0.0 <= width && width<=20.0)
        this.width=width;
    }
    public float area (){
        return this.lenght*this.width;
    }
    public float perimeter(){
        return (this.lenght+this.width)*2;
    }

}
