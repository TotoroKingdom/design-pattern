package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectConcrete implements Subject{

    private List<Observer> observerList = new ArrayList<Observer>();

    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        int index = observerList.indexOf(observer);
        if (index >= 0){
            observerList.remove(index);
        }

    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observerList) {
            observer.update(msg);
        }

    }
}
