package proxy_pattern;

/**
 * @author totoro
 * @date 2021-09-23 15:10
 */
public class RealSearcher implements Searcher{
    @Override
    public String doSearcher(String userId, String keyword) {
        System.out.println("用户 " + userId + " 使用关键词 " + keyword + " 查询商务信息 ");
        return "返回具体内容";
    }
}
