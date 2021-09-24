package builder_pattern.builder;

import builder_pattern.product.Actor;

/**
 * @author totoro
 * @date 2021-09-23 10:55
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCustume();

    public Actor createActor(){
        return actor;
    }
}
