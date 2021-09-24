package builder_pattern;

import builder_pattern.builder.ActorBuilder;
import builder_pattern.product.Actor;

/**
 * @author totoro
 * @date 2021-09-23 11:11
 */
public class ActorController {
    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCustume();
        actor = ab.createActor();
        return actor;
    }
}
