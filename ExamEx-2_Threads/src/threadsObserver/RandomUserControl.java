package threadsObserver;


import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import randomperson.RandomUser;
import randomperson.RandomUserGenerator;

public class RandomUserControl extends Observable  {
  public void fetchRandomUserNewThread(){
  Runnable r = () -> fetchRandomUser();
  
  new Thread(r).start();
  
  }
  public void fetchRandomUser() {
   RandomUser user= null;
    try {
      user = RandomUserGenerator.getRandomUser();
    } catch (InterruptedException ex) {
      Logger.getLogger(RandomUserControl.class.getName()).log(Level.SEVERE, null, ex);
    }
    setChanged();
      notifyObservers(user);
  }
}
