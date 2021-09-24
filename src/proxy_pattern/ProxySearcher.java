package proxy_pattern;

/**
 * @author totoro
 * @date 2021-09-23 15:13
 */
public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearcher(String userId, String keyword) {
       if (this.validate(userId)){
           String result = searcher.doSearcher(userId, keyword);
           this.log(userId);
           return result;
       }else{
           return null;
       }
    }

    public boolean validate(String userId){
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }
}
