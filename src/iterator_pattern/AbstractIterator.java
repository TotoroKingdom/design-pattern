package iterator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:11
 */
public interface AbstractIterator {
    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public Object getNextItem();
    public Object getPreviousItem();
}
