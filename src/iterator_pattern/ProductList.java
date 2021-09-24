package iterator_pattern;

import java.util.List;

/**
 * @author totoro
 * @date 2021-09-24 16:12
 */
public class ProductList extends AbstractObjectList{

    public ProductList(List<Object> products){
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
