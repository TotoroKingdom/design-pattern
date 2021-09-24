package flyweight_pattern;

import java.util.Hashtable;

/**
 * @author totoro
 * @date 2021-09-23 14:45
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;

    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public IgoChessman getIgoChessman(String color){
        return (IgoChessman) ht.get(color);
    }
}
