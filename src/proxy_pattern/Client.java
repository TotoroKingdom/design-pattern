package proxy_pattern;

import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-23 15:20
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        searcher.doSearcher("杨过","玉女真经");
    }
}
