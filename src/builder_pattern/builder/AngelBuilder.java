package builder_pattern.builder;

/**
 * @author totoro
 * @date 2021-09-23 10:58
 */
public class AngelBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCustume() {
        actor.setCustume("白裙");
    }
}
