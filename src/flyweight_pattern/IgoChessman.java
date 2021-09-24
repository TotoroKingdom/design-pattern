package flyweight_pattern;

/**
 * @author totoro
 * @date 2021-09-23 14:41
 */
public abstract class IgoChessman {
    public abstract String getColor();
    public void display(){
        System.out.println("棋子颜色：" + this.getColor());
    }
}
