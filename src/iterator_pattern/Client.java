package iterator_pattern;

import java.util.ArrayList;

/**
 * @author totoro
 * @date 2021-09-24 16:18
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Object> products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("葵花宝典");
        products.add("降龙十八掌");
        products.add("凌波微步");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();
        System.out.println("正向遍历-----------------------------");
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem()+",");
            iterator.next();
        }
        System.out.println("逆向遍历-----------------------------");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem()+",");
            iterator.previous();
        }

    }


}
