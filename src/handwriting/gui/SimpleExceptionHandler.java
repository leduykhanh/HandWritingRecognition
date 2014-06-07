package handwriting.gui;

import java.util.Observable;
import java.util.Observer;

public class SimpleExceptionHandler implements Observer {

	private FaceRecView view;
	public SimpleExceptionHandler(FaceRecView v){
		view=v;
	}
	public void handle(Exception e,String errorMsg){
		view.displayMessage(errorMsg);
	}
	@Override
	public void update(Observable obs, Object arg) {
		if (arg instanceof String) {
            String resp = (String) arg;
            view.displayMessage(resp);
        } 
		
	}

}
