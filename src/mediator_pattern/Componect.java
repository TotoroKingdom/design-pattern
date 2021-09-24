package mediator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:34
 */
public abstract class Componect {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    public void changed(){
        mediator.componentChanged(this);
    }
    public abstract void update();

}
