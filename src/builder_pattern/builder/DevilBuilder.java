package builder_pattern.builder;

/**
 * @author totoro
 * @date 2021-09-23 10:58
 */
public class DevilBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑丑丑");
    }

    @Override
    public void buildCustume() {
        actor.setCustume("黑衣");
    }
}
