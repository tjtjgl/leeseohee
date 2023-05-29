package music;

import java.util.Comparator;

public class DescTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o2.getSinger().compareTo(o1.getSinger()); 
	}

}
