package org.example.Singleton;

public enum ClassUniqueInstance {
    INSTANCE(005);
    private int click;
    private ClassUniqueInstance(int click){
        this.click=click;
    }
    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
