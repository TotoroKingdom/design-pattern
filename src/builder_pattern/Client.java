package builder_pattern;

import builder_pattern.builder.ActorBuilder;
import builder_pattern.product.Actor;
import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-23 11:17
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder ab;
        ab = (ActorBuilder) XMLUtil.getBean();

        ActorController actorController = new ActorController();
        Actor actor;
        actor = actorController.construct(ab);
        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getCustume());
    }
}
