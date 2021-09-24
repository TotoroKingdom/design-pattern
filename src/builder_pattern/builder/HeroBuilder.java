package builder_pattern.builder;

/**
 * @author totoro
 * @date 2021-09-23 10:58
 */
public class HeroBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("帅帅帅");
    }

    @Override
    public void buildCustume() {
        actor.setCustume("盔甲");
    }
}
