package designpattern.action.state;

import designpattern.PatternRole;

public interface State extends PatternRole {
	public void handle(Context context);

}
