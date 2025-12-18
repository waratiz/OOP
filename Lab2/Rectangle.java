package Lab2;
public class Rectangle {
    float height;
    float width;
    public Rectangle(float h,float wid){
        height = h;
        width = wid;
    }
    public float getArea(){
    return   width * height;    
}
public float getperimeter(){
    return  2 * (width + height);
}

}